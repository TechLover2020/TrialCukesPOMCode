package com.learning.test;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public By open_button = By.id("open");
	public By username = By.id("username");
	public By password = By.id("password");
	public By login_button = By.id("login-button");

	public By username() {
		return username;
	}

	public By password() {
		return password;
	}

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage navigateTo(String url) {
		driver.navigate().to(url);
		return new LoginPage(driver);
	}

	public NavigationPage loginAsAdmin() throws InterruptedException, IOException {
		Calendar calendar = Calendar.getInstance();
		String date = calendar.getTime().toString().trim().replaceAll(" ", "_").replace(":", "");
		driver.findElement(open_button).click();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\testing\\Screenshot_" + date + ".png"));
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("admin");
		driver.findElement(login_button).submit();
		return new NavigationPage(driver);
	}

	public NavigationPage loginAsAdmin(List<Map<String, String>> data, LoginPage login)
			throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		Calendar calendar = Calendar.getInstance();
		String date = calendar.getTime().toString().trim().replaceAll(" ", "_").replace(":", "");
		driver.findElement(open_button).click();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\fennymon\\Desktop\\CurrentBDD\\CukePOM\\screenshots\\Screenshot_" + date + ".png"));

		//driver.findElement(open_button).click();
		List<Map<String, String>> list = data;
		Method method[] = login.getClass().getMethods();
		for (Map<String, String> map : list) {
			for (Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				for (int i = 0; i < method.length; i++) {
					if (method[i].getName().equalsIgnoreCase(key)) {
						Method testamethod = login.getClass().getMethod(key);
						By x = (By) testamethod.invoke(login);
						driver.findElement(x).sendKeys(value);
					}
				}
			}
		}
		driver.findElement(login_button).click();
		return new NavigationPage(driver);
	}
}