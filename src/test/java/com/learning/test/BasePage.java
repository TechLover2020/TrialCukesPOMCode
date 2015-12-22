package com.learning.test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class BasePage {

	protected WebDriver driver;
	WebDriver chrome = null;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public BasePage openBrowser(String browserType) {
		try {
			if (browserType.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserType.equalsIgnoreCase("Chrome") && chrome == null) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\fennymon\\Desktop\\CurrentBDD\\CukePOM\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				chrome = driver;
			} else if (browserType.equals("Chrome") && chrome == null) {
				driver = chrome;
			} else if (browserType.equalsIgnoreCase("htmlunit")) {
				driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
				((HtmlUnitDriver) driver).setJavascriptEnabled(true);
			} else if (browserType.equalsIgnoreCase("phantomjs")) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
						"C:\\Users\\fennymon\\Desktop\\CurrentBDD\\CukePOM\\drivers\\phantomjs.exe");
				driver = new PhantomJSDriver(caps);
			}/* else if (browserType.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\fennymon\\Desktop\\CurrentBDD\\CukePOM\\drivers\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			} else if (browserType.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\fennymon\\Desktop\\CurrentBDD\\CukePOM\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}*/
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		return new BasePage(driver);
	}

	public void closeBrowser() throws IOException {
		try {
			driver.quit();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}
