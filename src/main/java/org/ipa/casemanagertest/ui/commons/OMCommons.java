package org.ipa.casemanagertest.ui.commons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OMCommons {

	SeleniumHelperClass helper = new SeleniumHelperClass();

	@FindBy(xpath = "//a[@class='clear-all-btn']")
	WebElement get_clearAll_selectedFilters;
	
	@FindBy(xpath = "//*[@id='case']")
	WebElement get_case;

	//@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div/div")
	@FindBy(xpath = "//div[contains(text(),'Select Case Status')]")
	WebElement get_filter;
						   
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button")
	WebElement get_filter_button;
	
	@FindBy(xpath = "//li[contains(text(),'Select All')]")
	WebElement get_selectAll;
				       
	@FindBy(xpath = "//*[@id='root']/div/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/form/div/div[3]/span/button")
	WebElement get_allocate_button;

	@FindBy(xpath = "//input[@placeholder='Case No./Patient Name/Patient MRN/Member ID/Accession No.']")
	WebElement search_CaseNo;

	@FindBy(xpath = "//input[@class='ant-checkbox-input']")
	WebElement click_checkBox;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/input")
	WebElement search_agent;

	@FindBy(xpath = "//td[2]/button")
	WebElement allocate_agent_button;

	@FindBy(className = "ant-select-selection__choice__remove")
	WebElement remove_Stauts_selected;

	@FindBy(className = "ant-select-selection__choice__remove")
	List<WebElement> remove_Stauts_selecte;

	//@FindBy(xpath = "//td[2]/a/span")
	@FindBy(xpath = "//tr[1]//td[3]/a/span")
	WebElement click_on_case;
	
	@FindBy(xpath = "//span[@class='ant-switch']")
	WebElement mark_IncompletInfo;
	
	@FindBy(xpath = "//span[contains(text(),'Referring physician')]")
	WebElement check_Incompdetails_RefPhysician; 
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Comment']")
	WebElement enter_CommentIncompInfo;
	
	@FindBy(xpath = "//div[@aria-expanded = 'false' and contains(text(),'Prior Authorization Status')]")
	WebElement expand_prior_authstatus;
	
	@FindBy(xpath = "//div[contains(text(),'Select TPA')]")
	WebElement tpa_selection;

	@FindBy(xpath = "//li[contains(.,'Humana')]")
	WebElement tpa_selection_humana;

	@FindBy(xpath = "//*[@id=\"top\"]/div/div[6]/div[3]/button")
	WebElement submit_om_button;

	@FindBy(xpath = "//li[contains(.,'Case Initiated')]")
	WebElement selectCaseInitiated;

	@FindBy(xpath = "//li[contains(.,'No Auth Required')]")
	WebElement selectNAR;

	@FindBy(xpath = "//div[contains(text(),'Select Contact Type')]")
	WebElement contactType;

	@FindBy(xpath = "//li[contains(.,'Calling')]")
	WebElement selectContactType;

	@FindBy(xpath = "//input[@placeholder='Case Ref No.']")
	WebElement selectCaseRef;

	@FindBy(xpath = "//input[@placeholder='Call Ref No.']")
	WebElement selectCallRef;

	@FindBy(xpath = "//input[@placeholder='Contact Person']")
	WebElement selectContactPerson;

	@FindBy(xpath = "//div[contains(text(),'Select Next Action')]")
	WebElement selectNextAction;

	@FindBy(xpath = "//li[contains(.,'Authorized')]")
	WebElement markAuthorized;

	@FindBy(xpath = "//li[contains(.,'Retro Authorized')]")
	WebElement markRetroAuthorized;

	@FindBy(xpath = "//li[contains(.,'Peer-to-Peer Review')]")
	WebElement markPeerToPeerReview;

	@FindBy(xpath = "//li[contains(.,'Quality Check')]")
	WebElement markQualityCheck;

	@FindBy(xpath = "//div[4]/div/div[2]/div/span/div/div/div")
	WebElement selectReject;

	@FindBy(xpath = "//li[contains(.,'Duplicate request')]")
	WebElement markDuplicateRequest;

	@FindBy(xpath = "//li[contains(.,'Insurance Review')]")
	WebElement markInsuranceReview;

	@FindBy(xpath = "//li[contains(.,'Additional Information Required')]")
	WebElement markAdditionalInfoRequired;
	
	// State Rename Addln Info --> Info Req for Payer.
	@FindBy(xpath = "//li[contains(.,'Info Required For Payor')]")
	WebElement markInfoRequiredForPayer;
	
	@FindBy(xpath = "//li[contains(.,'Info Required For Determination')]")
	WebElement markInfoRequiredForDetermination;
	
	@FindBy(xpath = "//li[contains(.,'Info Required For Initiation')]")
	WebElement markInfoRequiredForInitiation;
	
	@FindBy(css = ".row:nth-child(3) > .col-md-4:nth-child(1) .ant-input")
	WebElement typeAuthNumber;

	@FindBy(css = "#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(2) > div:nth-child(12) > div > div.ant-form-item-control-wrapper > div > span > input")
	WebElement typeAuthNumberforRetro;

	@FindBy(css = ".col-md-4:nth-child(5) .ant-input")
	WebElement typeTrackingNumber;

	@FindBy(css = ".col-md-4:nth-child(9) .ant-select-selection__placeholder")
	WebElement followUpType;

	@FindBy(css = ".ant-select-dropdown-menu-item-active")
	WebElement markAuto;

	@FindBy(css = ".col-md-4 .ant-calendar-picker-input")
	WebElement selectFollowDate;

	@FindBy(xpath = "//div[@id='top']/div/div[5]/div[3]/button")
	WebElement om_Job_Status;

	@FindBy(xpath = "//*[@id=\"top\"]/div/div[1]/div[1]/div/div[2]/div/span/span/div")
	WebElement omUpdatedCase;

	// IV Web Elements
	@FindBy(xpath = "//div[@class='col-lg-12']//div[1]//div[2]//div[6]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]")
	WebElement get_select_ActionFirst;

	@FindBy(xpath = "//div[@class='col-lg-12']//div[2]//div[2]//div[6]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]")
	WebElement get__select_ActionSecond;

	@FindBy(xpath = "//li[@class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active']")
	WebElement mark_EligibleWithCompleteBenefits;

	@FindBy(xpath = "//li[contains(.,'Eligible with partial benefits')]")
	WebElement mark_EligibleWithPartialBenefits;

	@FindBy(xpath = "//li[contains(.,'Not Eligible')]")
	WebElement mark_NotEligible;

	@FindBy(xpath = "//li[contains(.,'UnableToVerify')]")
	WebElement mark_UnableToVerify;

	@FindBy(xpath = "//div[@class='col-lg-12']/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/span[1]")
	WebElement get_om_FirstJobCurrentState;

	@FindBy(xpath = "//div[@class='col-lg-12']/div[2]/div[2]/div[6]/div[1]/div[1]/div[2]/span[1]")
	WebElement get_om_SecondJobCurrentState;

	@FindBy(xpath = "//span[@class='inline-block badge badge-success mx-2 mt-2']")
	WebElement get_om_CaseStatus;
	
	@FindBy(xpath = "//div[@class='col-lg-12']//div[1]//div[2]//div[2]//div[2]//div[1]//div[2]//input[1]")
	WebElement get_om_PatientCoInsurance;
	
	@FindBy(xpath = "//div[@class='col-lg-12']//div[1]//div[2]//div[1]//div[2]//div[1]//div[2]//input[1]")
	WebElement get_om_PatientCoPay;
	
	@FindBy(xpath = "//div[@class='col-md-5']//div[@class='custom-input ant-select ant-select-enabled']//div[1]//div[1]//div[1]")
	WebElement select_Reason;
	
	@FindBy(xpath = "//li[contains(text(),'Other')]")
	WebElement mark_ReasonOthers;

	@FindBy(xpath = "//div[contains(@class,'col-md-6')]//input[contains(@placeholder,'Missing Info.')]")
	WebElement add_ReasonMissingInfo;
	
	@FindBy(xpath = "//li[contains(text(),'Incomplete information')]")
	WebElement mark_ReasonIncompleteInfo;
	
	@FindBy(xpath = "//li[contains(text(),'Wrong information provided')]")
	WebElement mark_ReasonWrongInfoProvided;
	
	@FindBy(css= "#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(2) > div:nth-child(11) > div > div.ant-form-item-control-wrapper > div > span > div > div > div > div")
	WebElement select_Clinicals;
	
	@FindBy(css= "body > div:nth-child(10) > div > div > div > ul > li.ant-select-dropdown-menu-item.ant-select-dropdown-menu-item-active")
	WebElement Clinicals_NotRequired;
	//Constructor
	public OMCommons() {
		PageFactory.initElements(SetWebdrivers.getDriver(), this);
	}

	//Eligible With Complete Benefits
	public String eligibleWithCompleteBenefits() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(get_select_ActionFirst));
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");		
		Thread.sleep(4000);
		get_select_ActionFirst.click();
		mark_EligibleWithCompleteBenefits.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-200)");		
		wait.until(ExpectedConditions.visibilityOf(get__select_ActionSecond));
		get__select_ActionSecond.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(mark_EligibleWithCompleteBenefits));
		mark_EligibleWithCompleteBenefits.click();
		Thread.sleep(2000);
		submit_om_button.click();
		Thread.sleep(2000);
		String om_FirstJobCurrentState=get_om_FirstJobCurrentState.getText();
		String om_SecondJobCurrentState=get_om_SecondJobCurrentState.getText();
		System.out.println("First Job Current State"+om_FirstJobCurrentState);
		System.out.println("Second Job Current State"+om_SecondJobCurrentState);
		System.out.println("===Marked the 2 Jobs as FUll Eligible===");
		Thread.sleep(3000);
		return om_FirstJobCurrentState;
	}
	
	//Eligible With Partial Benefits
	public String UnabletoVerify() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(get_select_ActionFirst));
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");		
		Thread.sleep(4000);
		get_select_ActionFirst.click();
		mark_UnableToVerify.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-200)");	
		wait.until(ExpectedConditions.visibilityOf(get__select_ActionSecond));
		get__select_ActionSecond.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(mark_UnableToVerify));
		mark_UnableToVerify.click();
		Thread.sleep(2000);
		submit_om_button.click();
		Thread.sleep(2000);
		String om_FirstJobCurrentState=get_om_FirstJobCurrentState.getText();
		String om_SecondJobCurrentState=get_om_SecondJobCurrentState.getText();
		System.out.println("First Job Current State"+om_FirstJobCurrentState);
		System.out.println("Second Job Current State"+om_SecondJobCurrentState);
		System.out.println("===Marked the 2 Jobs as Unable to Verify===");
		Thread.sleep(3000);
		return om_FirstJobCurrentState;
	}
	
	public void searchCaseDetail(String caseNumber) throws Exception {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		get_case.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Case No./Patient Name/Accession No.']")));
		Thread.sleep(5000);
		get_clearAll_selectedFilters.click();
		//get_filter.click();
		//get_selectAll.click();
		Thread.sleep(2000);
		search_CaseNo.clear();
		Thread.sleep(2000);
		search_CaseNo.sendKeys(caseNumber);
		Thread.sleep(10000);
		get_filter_button.click();
		Thread.sleep(2000);
		SetWebdrivers.getDriver().manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	}
	public void searchCaseDetails(String caseNumber) throws Exception {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		get_case.click();
		get_clearAll_selectedFilters.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Case No./Patient Name/Accession No.']")));
		Thread.sleep(5000);
		get_filter.click();
		get_selectAll.click();
		Thread.sleep(2000);
		search_CaseNo.clear();
		Thread.sleep(2000);
		search_CaseNo.sendKeys(caseNumber);
		Thread.sleep(5000);
		get_filter_button.click();
		Thread.sleep(2000);
		SetWebdrivers.getDriver().manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	}

	public void allocateSwitchtoCaseDetailsPage() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		//Auto allocation is on for ipa
		Thread.sleep(10000);
		click_checkBox.click();
		get_allocate_button.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(search_agent));
		search_agent.click();
		search_agent.sendKeys("Senior");
		allocate_agent_button.click();
		Thread.sleep(5000);
		get_filter.click();
		get_selectAll.click();
		get_filter_button.click();
		Thread.sleep(2000);
		click_on_case.click();
		switchToCaseDetailsPage();
		System.out.println("===Case allocated and switched to case details page===");
	}
	
	public void markIncompleteInfo() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(mark_IncompletInfo));
		mark_IncompletInfo.click();
		wait.until(ExpectedConditions.visibilityOf(check_Incompdetails_RefPhysician));
		check_Incompdetails_RefPhysician.click();
		wait.until(ExpectedConditions.visibilityOf(enter_CommentIncompInfo));
		enter_CommentIncompInfo.sendKeys("Please provide the valid Referring Physcian details");
		wait.until(ExpectedConditions.visibilityOf(submit_om_button));
		Thread.sleep(5000);
		submit_om_button.click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		String omJobStatus= getOMJobStatus();
		System.out.println("getting status --"+omJobStatus);
		switchToIPA();
		System.out.println("=== Marked the case with Incomplete info ===");
	}

	public void searchInprogressCaseDetails(String caseNumber) throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(get_case));
		get_case.click();
		if (remove_Stauts_selecte.size() != 0) {
			remove_Stauts_selected.click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div")));
		search_CaseNo.clear();
		search_CaseNo.sendKeys(caseNumber);
		get_filter.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(click_on_case));
		click_on_case.click();
		switchToCaseDetailsPage();
		System.out.println("=== IN Progress Case opened and switched to case details page===");
	}
	public void switchToIPA() throws Exception {
		SetWebdrivers.getDriver().close();
		switchToIPAPage();
	}

	public void switchToCaseDetailsPage() throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(SetWebdrivers.getDriver().getWindowHandles());
		SetWebdrivers.getDriver().switchTo().window(tabs.get(2));
		System.out.println("===switched to case details page===");
	}

	public void switchToIPAPage() throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(SetWebdrivers.getDriver().getWindowHandles());
		SetWebdrivers.getDriver().switchTo().window(tabs.get(0));
		System.out.println("===switched to IPA page===");
	}

	public WebElement edit_case_close_button() throws Exception {
		return helper.findWebElementbyXpath("/html/body/div[2]/div[2]/div/div/div[1]/button");
	}

	public void switchToOMPage() throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(SetWebdrivers.getDriver().getWindowHandles());
		SetWebdrivers.getDriver().switchTo().window(tabs.get(1));
		System.out.println("===switched to OM page===");
	}

	public void selectTPA() throws InterruptedException, Exception {
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		expand_prior_authstatus.click();
		js.executeScript("window.scrollBy(0,-50)");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(tpa_selection));
		//Enable the below action if OM is not auto selecting the TPA.
		//tpa_selection.click();
		//tpa_selection_humana.click();
		submit_om_button.click();
		System.out.println("===TPA selected===");
	}

	public void caseInitiated() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		wait.until(ExpectedConditions.visibilityOf(selectCaseInitiated));
		selectCaseInitiated.click();
		contactType.click();
		selectContactType.click();
		selectCaseRef.sendKeys("15344");
		selectCallRef.sendKeys("25344");
		selectContactPerson.sendKeys("Dinesh");
		Thread.sleep(1000);
		submit_om_button.click();
		System.out.println("===Marked the case as case initiated===");
	}

	public void caseInfoReqForInitiation() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		wait.until(ExpectedConditions.visibilityOf(selectCaseInitiated));
		markInfoRequiredForInitiation.click();
		submit_om_button.click();
		System.out.println("===Marked the case as case initiated===");
	}
	
	public void caseInfoReqForDetermination() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		wait.until(ExpectedConditions.visibilityOf(selectCaseInitiated));
		markInfoRequiredForDetermination.click();
		submit_om_button.click();
		System.out.println("===Marked the case as case initiated===");
	}
	
	public void caseInfoReqForPayor() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		wait.until(ExpectedConditions.visibilityOf(selectCaseInitiated));
		markInfoRequiredForPayer.click();
		submit_om_button.click();
		System.out.println("===Marked the case as case initiated===");
	}
	
	public String authorized() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markAuthorized.click();
		typeAuthNumber.click();
		typeAuthNumber.sendKeys("35344");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(2) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(8) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(5) > div").click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(4) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(9) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr:nth-child(5) > td:nth-child(7) > div").click();
		typeTrackingNumber.sendKeys("45344");
		Thread.sleep(1000);
		submit_om_button.click();
		System.out.println("===Marked the case as case authorized===");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-200)");
		switchToIPA();
		return "Authorized";
		}
	public String authorizedins() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markAuthorized.click();
		typeAuthNumber.click();
		typeAuthNumber.sendKeys("35344");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(2) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td.ant-calendar-cell.ant-calendar-today.ant-calendar-selected-day > div").click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(4) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(12) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(7) > div").click();
		typeTrackingNumber.sendKeys("45344");
		submit_om_button.click();
		System.out.println("===Marked the case as case authorized===");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-200)");
		switchToIPA();
		return "Authorized";
		}
	public String authorizedp2p() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markRetroAuthorized.click();
		selectCallRef.sendKeys("25344");
		typeAuthNumberforRetro.sendKeys("35344");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(2) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(10) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td.ant-calendar-cell.ant-calendar-today.ant-calendar-selected-day > div").click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(3) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(5) > div").click();
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		switchToIPA();
		System.out.println("===Marked the case as authorized===");
		return "Retro Authorized";
	}

	public String NAR() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		selectNAR.click();
		contactType.click();
 		selectContactType.click();
		selectCaseRef.sendKeys("15344");
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		switchToIPA();
		System.out.println("===Marked the case as NAR===");
		return "NAR";
	}

	public String retroAuthorized() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markRetroAuthorized.click();
		selectCallRef.sendKeys("25344");
		typeAuthNumberforRetro.sendKeys("35344");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(2) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(8) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(7) > div").click();
		
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(3) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(9) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(7) > div").click();
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		switchToIPA();
		System.out.println("===Marked the case as retro authorized===");
		return "Retro Authorized";
	}
public String retroAuthorizedins() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markRetroAuthorized.click();
		selectCallRef.sendKeys("25344");
		typeAuthNumberforRetro.sendKeys("35344");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(2) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td.ant-calendar-cell.ant-calendar-today.ant-calendar-selected-day > div").click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(3) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(12) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(7) > div").click();
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		switchToIPA();
		System.out.println("===Marked the case as retro authorized===");
		return "Retro Authorized";
	}
public String retroAuthorizedp2p() throws Exception {
	
	WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
	wait.until(ExpectedConditions.visibilityOf(selectNextAction));
	Thread.sleep(1000);
	selectNextAction.click();
	Thread.sleep(1000);
	markRetroAuthorized.click();
	selectCallRef.sendKeys("25344");
	typeAuthNumberforRetro.sendKeys("35344");
	helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(2) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
	helper.findWebElementbyCss("body > div:nth-child(10) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td.ant-calendar-cell.ant-calendar-today.ant-calendar-selected-day > div").click();
	JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
	js.executeScript("window.scrollBy(0,-200)");
	helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div:nth-child(3) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
	helper.findWebElementbyCss("body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(5) > div").click();
	Thread.sleep(1000);
	submit_om_button.click();
	Thread.sleep(3000);
	switchToIPA();
	System.out.println("===Marked the case as retro authorized===");
	return "Retro Authorized";
}
	public String peerToPeerReview() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markPeerToPeerReview.click();
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(2) > div:nth-child(7) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(8) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(7) > div").click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(2) > div:nth-child(8) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(9) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(5) > div").click();
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div.col-md-4 > div > div.ant-form-item-control-wrapper > div > span > input").sendKeys("35344");
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		System.out.println("===Marked the case as peer to peer review===");
		return "Peer-to-Peer Review";
	}

	public String peerToPeerReviewins() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markPeerToPeerReview.click();
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(2) > div:nth-child(7) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td.ant-calendar-cell.ant-calendar-today.ant-calendar-selected-day > div").click();
		JavascriptExecutor js = (JavascriptExecutor) SetWebdrivers.getDriver();
		js.executeScript("window.scrollBy(0,-200)");
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(2) > div:nth-child(8) > div > div.ant-form-item-control-wrapper > div > span > span > div > i > svg").click();
		helper.findWebElementbyCss("body > div:nth-child(12) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr.ant-calendar-current-week.ant-calendar-active-week > td:nth-child(5) > div").click();
		helper.findWebElementbyCss("#root > div > div > div > div.ant-layout > div.ant-layout-content > div > div > div > div:nth-child(3) > div > div.ant-tabs.ant-tabs-top.ant-tabs-line > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(3) > div > div > div.ant-collapse-content.ant-collapse-content-active > div > div > div > div > div > div.card-body.border > div:nth-child(1) > div.col-md-7 > div:nth-child(3) > div.col-md-4 > div > div.ant-form-item-control-wrapper > div > span > input").sendKeys("35344");
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		System.out.println("===Marked the case as peer to peer review===");
		return "Peer-to-Peer Review";
	}
	public String qualityCheck() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markQualityCheck.click();
		Thread.sleep(2000);
		selectReject.click();
		markDuplicateRequest.click();
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		switchToIPA();
		System.out.println("===Marked the case as quality check===");
		return "Quality Check";
	}

	public String insuranceReview() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markInsuranceReview.click();
		Thread.sleep(1000);
		followUpType.click();
		markAuto.click();
		Thread.sleep(1000);
		selectFollowDate.click();
		Thread.sleep(1000);
		helper.findWebElementbyCss("body > div:nth-child(9) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-body > table > tbody > tr:nth-child(5) > td:nth-child(7) > div").click();
		Thread.sleep(1000);
		select_Clinicals.click();
		Clinicals_NotRequired.click();
		Thread.sleep(1000);
		submit_om_button.click();
		Thread.sleep(3000);
		System.out.println("===Marked the case as insurance review===");
		Thread.sleep(3000);
		return "Insurance Review";
	}

	public String additionalInformationRequired() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		Thread.sleep(1000);
		markAdditionalInfoRequired.click();
		submit_om_button.click();
		Thread.sleep(3000);
		String omJobStatus= getOMJobStatus();
		System.out.println("getting status --"+omJobStatus);
		switchToIPA();
		System.out.println("===Marked the case as additional info required===");
		return omJobStatus;
	}

	public String NARWithPreData() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		selectNAR.click();
		submit_om_button.click();
		Thread.sleep(3000);
		switchToIPA();
		System.out.println("===Marked the case as NAR===");
		return "NAR";
	}
	public String getOMJobStatus() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(om_Job_Status));
		String omJobStatus = om_Job_Status.getText();	
		return omJobStatus;

	}
	
	public String updatedPatientName() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(omUpdatedCase));
		Thread.sleep(5000);
		return omUpdatedCase.getText();
	}
	
	public void clickOnCaseandSwitchToCaseDetails() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(click_on_case));
		click_on_case.click();
		switchToCaseDetailsPage();
		System.out.println("===Case allocated and switched to case details page===");
	}
	public String insuranceReviewForAdditionalInfo() throws Exception {
		WebDriverWait wait = new WebDriverWait(SetWebdrivers.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(selectNextAction));
		Thread.sleep(1000);
		selectNextAction.click();
		markInsuranceReview.click();
		submit_om_button.click();
		Thread.sleep(3000);
		String omJobStatus= getOMJobStatus();
		System.out.println("getting status --"+omJobStatus);
		System.out.println("===Marked the case as insurance review===");
		Thread.sleep(3000);
		return omJobStatus;
	}

}
