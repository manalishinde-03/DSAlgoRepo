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
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class DSAlgo_Login_SD {

	/*
	 * WebDriver driver = new ChromeDriver(); LoginPage loginPage; HomePage
	 * homePage;
	 * 
	 * @Given("user navigates to Home page") public void
	 * user_navigates_to_home_page() {
	 * driver.get("https://dsportalapp.herokuapp.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 * driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	 * 
	 * }
	 * 
	 * @Given("user clicks on Sign in link") public void
	 * user_clicks_on_sign_in_link() {
	 * driver.findElement(By.linkText("Sign in")).click(); }
	 * 
	 * @When("^user enters (.*) in username field on Login page$") public void
	 * user_enters_username_in_username_field(String username) {
	 * //driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username
	 * );
	 * 
	 * loginPage = new LoginPage(driver); loginPage.enterUsername(username); }
	 * 
	 * @When("^user enters (.*) in password field on Login page$") public void
	 * user_enters_passwords_in_password_field(String password) {
	 * loginPage.enterPassword(password); }
	 * 
	 * @When("user clicks on Login button") public void
	 * user_clicks_on_login_button() { loginPage.clickLoginBtn(); }
	 * 
	 * @Then("^validate the (.*) on home page$") public void
	 * validate_the_message_on_home_page(String message) {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * homePage.validateMsgAfterLogin(message);
	 * 
	 * 
	 * driver.findElement(By.linkText("Get Started")).click();
	 * driver.findElement(By.linkText("Time Complexity")).click();
	 * 
	 * Actions action = new Actions(driver);
	 * action.scrollToElement(driver.findElement(By.linkText("Try here>>>")));
	 * 
	 * driver.findElement(By.linkText("Try here>>>")).click();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * WebElement tryEditorForm =
	 * driver.findElement(By.xpath("//div[@class='input']/div/div/textarea"));
	 * tryEditorForm.sendKeys("hello");
	 * 
	 * }
	 * 
	 * @Then("^validate the (.*) and sign out button display on Home page$") public
	 * void validate_the_username_and_sign_out_button_display(String username) {
	 * homePage.verifyUsernameSignOutLinkOnHomePage(username); }
	 * 
	 * @Then("^validate the (.*) on Login page$") public void
	 * validate_the_error_message_on_login_page(String errorMsg) {
	 * loginPage.validateToolTipErrorMsg(errorMsg);
	 * 
	 * 
	 * }
	 * 
	 * @Then("^validate the (.*) on Login page for invalid credential$") public void
	 * validate_the_error_message_on_login_page_invalidCredential(String errorMsg) {
	 * loginPage.validateErrorMsg(errorMsg);
	 * 
	 * 
	 * }
	 * 
	 * @Then("user clicks on Register link on Login page") public void
	 * user_clicks_on_register_link_on_login_page() { loginPage.clickRegisterLink();
	 * }
	 * 
	 */
}
