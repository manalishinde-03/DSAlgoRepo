package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgo_DataStructuresIntroduction_SD {
	
	/*
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * @Given("user launches the DSAlgo portal URL") public void
	 * user_launches_the_ds_algo_portal_url() {
	 * driver.get("https://dsportalapp.herokuapp.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 * 
	 * }
	 * 
	 * @Given("user clicks on Get Started button") public void
	 * user_clicks_on_get_started_button() {
	 * driver.findElement(By.xpath("//button[text()='Get Started']")).click(); }
	 * 
	 * @Then("user landed on the Home page") public void
	 * user_landed_on_the_home_page() {
	 * driver.getPageSource().contains("NumpyNinja");
	 * System.out.println("User landed on Home page!"); }
	 * 
	 * @Then("user clicks Data Structures dropdown and able to see all options")
	 * public void user_is_able_to_see_all_options_in_data_structures_dropdown() {
	 * 
	 * driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click(
	 * );
	 * 
	 * List <WebElement> dsOptions =
	 * driver.findElements(By.xpath("//div/a[@class='dropdown-item']"));
	 * 
	 * String expectedOptions [] = {"Arrays",
	 * "Linked List","Stack","Queue","Tree","Graph"};
	 * 
	 * for (int i = 0; i < dsOptions.size(); i++) { dsOptions.get(i).getText();
	 * Assert.assertEquals(dsOptions.get(i).getText(), expectedOptions[i]);
	 * 
	 * } }
	 * 
	 * @Then("user clicks Register link and navigates to Register page") public void
	 * user_clicks_register_link_and_navigates_to_register_page() {
	 * 
	 * driver.findElement(By.linkText("Register")).click(); WebElement
	 * registrationForm = driver.findElement(By.xpath("//form[@method='post']"));
	 * registrationForm.isDisplayed();
	 * 
	 * }
	 * 
	 * @Then("user clicks Sign-in link and navigates to Login page") public void
	 * user_clicks_sign_in_link_and_navigates_to_login_page() {
	 * driver.findElement(By.linkText("Sign in")).click(); WebElement loginForm =
	 * driver.findElement(By.xpath("//form[@method='post']"));
	 * loginForm.isDisplayed(); }
	 * 
	 * @Then("user clicks on Get Started button below any Data Structure topic")
	 * public void
	 * user_clicks_on_get_started_button_below_any_data_structure_topic() { //
	 * driver.findElement(By.xpath("//div[3]/div[1]/div/div/a")).click();
	 * 
	 * driver.findElement(By.linkText("Get Started")).click(); }
	 * 
	 * @Then("user not logged in warning message should be displayed") public void
	 * user_not_logged_in_warning_message_should_be_displayed() {
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); String
	 * warningMsg =
	 * driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText()
	 * ;
	 * 
	 * assertEquals("You are not logged in", warningMsg);
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
}
