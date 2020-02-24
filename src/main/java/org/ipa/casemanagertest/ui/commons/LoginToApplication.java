package org.ipa.casemanagertest.ui.commons;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginToApplication {
	SeleniumHelperClass helper = new SeleniumHelperClass();
	String newWindow;

	public WebElement get_username() throws Exception {
		return helper.findWebElementbyid("username");
	}

	public WebElement get_password() throws Exception {
		return helper.findWebElementbyid("password");
	}

	public WebElement get_usernameButton() throws Exception {
		return helper.findWebElementbyXpath("//span[@class='infx-lgn-span-username']");
	}
	
	public WebElement get_ipa_logout() throws Exception {
		return helper.findWebElementbyXpath("//button[contains(text(),'Logout')]");
	}

	public WebElement get_username_submit() throws Exception {
		return helper.findWebElementbyCss("#kc-form-login > div > div > div.login-details > button");
	}

	public WebElement get_om_submit() throws Exception {
		return helper.findWebElementbyXpath("//*[@id=\"kc-login\"]");
	}

	public List<WebElement> get_case() throws Exception {
		return helper.findWebElementsbyId("case");
	}

	public void LoginToIPA(String userName, String password) throws Exception {
		Thread.sleep(2000);
		get_username().sendKeys(userName);
		Thread.sleep(2000);
		get_password().sendKeys(password);
		Thread.sleep(2000);
		get_username_submit().click();
		Thread.sleep(2000);
	}

	public void LogoutFromIPA() throws Exception {
		get_usernameButton().click();
		Thread.sleep(2000);
		get_ipa_logout().click();
		get_username().sendKeys("Log out redirects to login page");
	}
	
	public void LoginToOM(String environment) throws Exception {
		newWindow = SetWebdrivers.getDriver().getWindowHandle();
		Properties props = new Properties();
		String fileName = "environment//" + environment + "//" + environment + ".properties";
		InputStream inStream = getClass().getClassLoader().getResourceAsStream(fileName);
		if (inStream != null) {
			props.load(inStream);
		} else {
			throw new FileNotFoundException(fileName + "not found in properties");
		}
		//SetWebdrivers.getDriver().findElement(By.cssSelector("body")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) SetWebdrivers.getDriver()).executeScript("window.open()");
		Thread.sleep(1000);
		Set<String> windowHandles = SetWebdrivers.getDriver().getWindowHandles();
		int count = windowHandles.size();
		System.out.println("count is " + count);
		for (String child : windowHandles) {
			if (!newWindow.equals(child)) {
				SetWebdrivers.getDriver().switchTo().window(child);
				SetWebdrivers.getDriver().get(props.getProperty("OM.baseurl"));
				String userdetails = props.getProperty("om.test.login");
				String[] user = userdetails.split(":");
				String userName = user[0];
				String password = user[1];
				Thread.sleep(2000);
				get_username().sendKeys(userName);
				Thread.sleep(2000);
				get_password().sendKeys(password);
				Thread.sleep(2000);
				get_om_submit().click();
				Thread.sleep(2000);
			}
		}
	}
}
