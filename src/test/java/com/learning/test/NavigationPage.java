package com.learning.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPage extends BasePage {

	public NavigationPage(WebDriver driver) {
		super(driver);
	}

	public NavigationPage checkForNavigationList() {
		WebElement navList = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("navlist")));
		navList.click();
		return new NavigationPage(driver);
	}
}