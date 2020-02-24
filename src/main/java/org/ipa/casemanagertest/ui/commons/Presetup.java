package org.ipa.casemanagertest.ui.commons;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Presetup {
	
	WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	@Parameters({"environment","browser","tenant"})
	public void PresetupSuite(String env,String browser,String tenant) throws Exception {
		SetWebdrivers setWebDrivers = new SetWebdrivers();	
		setWebDrivers.openBrowser(env,browser,tenant);
	}
	@BeforeTest(alwaysRun = true)
	@Parameters({"userName","password"})
	public void Login(String userName, String password) throws Exception
	{
		LoginToApplication login = new LoginToApplication();
		login.LoginToIPA(userName,password);	
	}
	
	@AfterSuite(alwaysRun=true)
	public void tearDown() {
		SetWebdrivers.getDriver().quit();
	}
}
