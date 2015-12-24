package com.learning.test;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.runtime.junit.Assertions;

public class tria {

	public static void main(String[] args) {
		//String PHANTOMJS_BINARY = System.getProperty("phantomjs.binary");
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println(System.getProperty("user.dir")+"\\");
		/*DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
		WebDriver driver = new PhantomJSDriver(capabilities);
		driver.get("http://www.appneta.com/");*/
		System.out.println("phantomjs.binary");
	}
}