package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import tests.BaseTest;

public class LoginSteps {

	WebDriver driver = null;
	LoginPage lp = null;
	HomePage hp = null;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = BaseTest.getBrowserDriver("chrome", false);
		driver.get("https://login.salesforce.com");
		lp = new LoginPage(driver);
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
		lp.enterUsername("jul22.mithun@ta.com");
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
		lp.enterPassword("Mac@1234");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		lp.clickLogin();
	}

	@Then("User should land on home page")
	public void user_should_land_on_home_page() {
		hp = new HomePage(driver);
		assertTrue(hp.verifyHomePage(), "Home page should be visible");
	}

	@When("User enters in-valid username")
	public void user_enters_in_valid_username() {
		lp.enterUsername("jmithun@ta.com");
	}

	@When("User enters in-valid password")
	public void user_enters_in_valid_password() {
		lp.enterPassword("Mac234");
	}

	@Then("User should see a error message")
	public void user_should_see_a_error_message() throws FileNotFoundException, IOException {
		assertTrue(lp.verifyLoginErrorMessage(driver), "Login error message should be shown");
	}
}
