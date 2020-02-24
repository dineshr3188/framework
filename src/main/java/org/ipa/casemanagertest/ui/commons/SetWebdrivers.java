package org.ipa.casemanagertest.ui.commons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;

public class SetWebdrivers {
	static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	

	public static WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver openBrowser(String environment,String browser,String tenant) throws IOException {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver",  "src\\test\\resources\\geckodriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-extensions");
		opt.addArguments("--start-maximized");
		//opt.addArguments("--headless");
		//opt.addArguments("--window-size=1024,578");
		//opt.addArguments("--disable-gpu");
		driver = new ChromeDriver(opt);
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1024,578));
		driver.manage().window().maximize();
		System.out.println("Opening chrome browser..");
		Properties props = new Properties();
		String fileName = "environment//" + environment + "//" + environment + ".properties";
		InputStream inStream = getClass().getClassLoader().getResourceAsStream(fileName);
		if (inStream != null) {
			props.load(inStream);
		} else {
			throw new FileNotFoundException(fileName + "not found in properties");
		}
		driver.get(props.getProperty("casemanager.baseurl")+tenant+"/");
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",  "src\\test\\resources\\geckodriver.exe");
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			 //capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver();
			e_driver = new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().setSize(new Dimension(1024,578));
			driver.manage().window().maximize();
			System.out.println("Opening firefox browser..");
			Properties props = new Properties();
			String fileName = "environment//" + environment + "//" + environment + ".properties";
			InputStream inStream = getClass().getClassLoader().getResourceAsStream(fileName);
			if (inStream != null) {
				props.load(inStream);
			} else {
				throw new FileNotFoundException(fileName + "not found in properties");
			}
			driver.get(props.getProperty("casemanager.baseurl")+tenant+"/");
			
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",  "src\\test\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			e_driver = new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().setSize(new Dimension(1024,578));
			driver.manage().window().maximize();
			System.out.println("Opening IE browser..");
			Properties props = new Properties();
			String fileName = "environment//" + environment + "//" + environment + ".properties";
			InputStream inStream = getClass().getClassLoader().getResourceAsStream(fileName);
			if (inStream != null) {
				props.load(inStream);
			} else {
				throw new FileNotFoundException(fileName + "not found in properties");
			}
			driver.get(props.getProperty("casemanager.baseurl")+tenant+"/");
			
		}
		return driver;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("C:\\Users");
		FileUtils.copyFile(srcFile, new File(currentdir+"/screenshots/"+System.currentTimeMillis()+".png"));	
	}
}
