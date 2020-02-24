package org.ipa.casemanagertest.ui.commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IPACreateCase {

	SeleniumHelperClass helper = new SeleniumHelperClass();

	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/ul/li[1]/button")
	WebElement get_username;

	
	
	public IPACreateCase() {
		PageFactory.initElements(SetWebdrivers.getDriver(), this);
	}

	public void navigate_page_completed() throws Exception {
		get_username.click();
	}

}
