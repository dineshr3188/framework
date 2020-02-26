package org.ipa.casemanagertest.ui.commons;

import java.util.Objects;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import net.minidev.json.JSONArray;

public class APIRestCommons {
	ObjectMapper mapper = new ObjectMapper();


	public String LoginToOM(String path, String rbody) {
		String resp = RestAssured.given().relaxedHTTPSValidation().header("ifx-security-realm", "ops_mgr")
				.contentType(ContentType.JSON).body(rbody).when().expect().log().all().statusCode(200).post(path)
				.asString();
		return resp;
	}

	public String LoginToIPA(String body) {
		String resp = RestAssured.given().relaxedHTTPSValidation().header("Ifx-Security-Realm", realm)
				.contentType(ContentType.JSON).body(body).when().expect().log().all().statusCode(200)
				.post(env + "/usersrvc/authz/login").asString();
		return resp;
	}

	public String postRestAPI(String path, String rbody, String token) {
		String resp = RestAssured.given().relaxedHTTPSValidation().header("userid", "").header("sec-fetch-mode", "cors")
				.header("x-api-version", "1").header("Authorization", "Bearer " + token)
				.header("ifx-security-realm", "ops_mgr").contentType(ContentType.JSON).body(rbody).when().log().all()
				.expect().statusCode(200).post(path).asString();
		return resp;
	}

	public String getRestAPI(String path, String token) {
		System.out.println("Getting API for : " + path);
		String resp = RestAssured.given().relaxedHTTPSValidation().header("userid", "1").header("x-api-version", "1")
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", "ops_mgr")
				.contentType(ContentType.JSON).when().log().all().expect().statusCode(200).get(path).asString();
		return resp;
	}

	public void patchRestAPI(String path, String rbody, String token) {
		RestAssured.given().relaxedHTTPSValidation().header("userid", "1").header("x-api-version", "1")
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", "ops_mgr")
				.contentType(ContentType.JSON).body(rbody).when().log().all().patch(path).asString();
	}

	public String postRestAP(String path, String rbody, String token) {
		String resp = RestAssured.given().header("tenantkey", tenant).relaxedHTTPSValidation()
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", realm)
				.contentType(ContentType.JSON).body(rbody).when().log().all().expect().statusCode(200).post(path)
				.asString();
		return resp;

	}

	public String putRestAP(String path, String rbody, String token) {
		String resp = RestAssured.given().header("tenantkey", tenant).relaxedHTTPSValidation()
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", realm)
				.contentType(ContentType.JSON).body(rbody).when().log().all().expect().statusCode(200).put(path)
				.asString();
		return resp;
	} 
	
	public String cancelCaseAPI(String path, String token) {
		String resp = RestAssured.given().header("tenantkey", tenant).relaxedHTTPSValidation()
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", realm)
				.contentType(ContentType.JSON).when().log().all().expect().statusCode(200).delete(path)
				.asString();
		return resp;
	}
	
	public String getJobStatus(String path, String token) {
		String resp = RestAssured.given().header("tenantkey", tenant).relaxedHTTPSValidation()
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", realm).when().log().all()
				.expect().statusCode(200).get(env + "/casemanager/api/casemanager/number?number=" +path).asString();
		return resp;

	}

	public String getRestApi(String path, String token) {
		String resp = RestAssured.given().relaxedHTTPSValidation()
				.header("Authorization", "Bearer " + token).header("ifx-security-realm", realm).when().log().all()
				.expect().statusCode(200).get(path).asString();
		return resp;
	}

	

	

	

	public String LoginToIPA() {
		String body = "{ \"password\": \"" + password + "\", \"userName\": \"" + userName + "\"}";
		String resp = LoginToIPA(body);
		JSONArray arr = JsonPath.read(resp, "$..token");
		String token = arr.get(0).toString();
		return token;

	}

	public String env;
	public String tenant;
	public String realm;
	public String userName;
	public String password;

	public String getEnv() {
		return env;
	}

	public String getTenant() {
		return tenant;
	}

	public String getRealm() {
		return realm;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	@BeforeTest(alwaysRun = true)
	@Parameters({ "environment", "tenant", "realm", "userName", "password" })
	public void env(@Optional String environment, @Optional String tenant, @Optional String realm,@Optional String userName,@Optional String password) {
		this.tenant = tenant;
		if (environment.equals("dev")) {
			this.env = "https://devipa.infinx.com";
		} 
		else if(environment.equals("prod")) {
			this.env = "https://ipa.infinx.com";
		}
		else if (environment.equals("test")) {
			this.env = "https://testipa.infinx.com";
		}
		this.realm = realm;
		this.userName = userName;
		this.password = password;
	}
	
	public String createRandomString() {
		return Objects.toString(System.currentTimeMillis());
		//return RandomStringUtils.random(5);
	}
}