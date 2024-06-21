package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class DSAlgo_Register_SD {
	
	WebDriver driver = new ChromeDriver();
	
	LoginPage loginPage;
	HomePage homePage;
	RegisterPage registerPage;
	

	@Given("user clicks on Register link")
	public void user_clicks_on_register_link() {
		homePage = new HomePage(driver);
		homePage.clickRegister();
	}
	
	@When("^user enters (.*) in username field on Register page$")
	public void user_enters_username_on_register_page(String username) {
		registerPage = new RegisterPage(driver);
		registerPage.enterUsername(username);
		
		
	}
	@When("^user enters (.*) and (.*) in password fields on Register page$")
	public void user_enters_password_and_Passwordconfirm_on_register_page(String password, String confirmPassword) {
		registerPage.enterPassword(password);
		registerPage.enterPasswordConfirmation(confirmPassword);
	}
	
	
	@When("user clicks on Register button")
	public void user_clicks_on_register_button() {
		registerPage.clickRegisterBtn();
	}
	
	@Then("validate the (.*) on home page")
	public void validate_success_message_homepage(String expectedMessage) {
		homePage.validateMsgAfterRegistration(expectedMessage);;
	}
}
