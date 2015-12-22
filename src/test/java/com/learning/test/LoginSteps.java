package com.learning.test;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;
	LoginPage login;
	NavigationPage nav;

	@Given("^the Symbiote home page \"([^\"]*)\" on \"([^\"]*)\"$")
	public void the_symbiote_home_page_something_on_something(String url, String browser) {
		login = new LoginPage(driver);
		login.openBrowser(browser);
		login.navigateTo(url);
	}

	@When("^logging in as an admin$")
	public void logging_in_as_an_admin() throws InterruptedException, IOException {
		 nav = login.loginAsAdmin();
	}

	@Then("^the home page navigation is available$")
	public void the_home_page_navigation_is_available() throws IOException {
		nav.checkForNavigationList();
		nav.closeBrowser();
	}

	@When("^logging in as an admin with details$")
	public void logging_in_as_an_admin_with_details(DataTable table) throws Throwable {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		nav = login.loginAsAdmin(data, login);
	}
	
	
}