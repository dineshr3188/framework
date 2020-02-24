package org.ipa.casemanagertest.ui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.ipa.casemanagertest.ui.commons.IPACreateCase;
import org.testng.annotations.Test;

public class CaseTestUI {

	
	String name;
	String caseNumber;
	String draftId;
	String fileName;

	public void getFile(String environment) {
		if(environment.equals("test")) {
			fileName="uiinput.json";
		}
		if(environment.equals("dev")) {
			fileName="uiinput.json";
		}
		else if(environment.equals("prod")) {
			fileName="prod.json";
		}
		else if(environment.equals("stage")) {
			fileName="prod.json";
		}
	}
	
	public void readFile(String fileName) throws IOException {
		String file = this.getClass().getClassLoader().getResource("com.infinx.imanager.casemanager/input/" + fileName).getPath();
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
		String json = org.apache.commons.io.IOUtils.toString(reader);
		//input = new Gson().fromJson(json, this.class);
	}

	@Test(priority = 1, groups = { "uiplus" })
	public void createCaseTest() throws Exception {
		System.out.println("====================================================");
		System.out.println("Running case create test");
		readFile("uiinput.json");
		IPACreateCase obj = new IPACreateCase();
		System.out.println(caseNumber);
	}

	
}