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
import pageFactory.HomePage_PF;

public class DSAlgo_Home_SD {
	
	WebDriver driver = new ChromeDriver();
	HomePage_PF homePagePF;
	
	@Given("user launches the DSAlgo portal URL")
	public void user_launches_the_ds_algo_portal_url() {
		driver.get("https://dsportalapp.herokuapp.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   
	}

	@Given("user clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		homePagePF = new HomePage_PF(driver);
		homePagePF.clickGetStartedBtn();
	}

	@Then("user landed on the Home page")
	public void user_landed_on_the_home_page() {
		homePagePF = new HomePage_PF(driver);
		homePagePF.validateUserLandedOnHomePage();
	}

	@Then("user clicks Data Structures dropdown and able to see all options")
	public void user_is_able_to_see_all_options_in_data_structures_dropdown() {
		//homePagePF = new HomePage_PF(driver);
		homePagePF.validateDataStrucruesDropdown();
		
	}

	@Then("user clicks Register link and navigates to Register page")
	public void user_clicks_register_link_and_navigates_to_register_page() {
		//homePagePF = new HomePage_PF(driver);
		homePagePF.clickRegister();
	}

	@Then("user clicks Sign-in link and navigates to Login page")
	public void user_clicks_sign_in_link_and_navigates_to_login_page() {
		homePagePF.clickSignIn();
		
	}

	@Then("user clicks on Get Started button below any Data Structure topic")
	public void user_clicks_on_get_started_button_below_any_data_structure_topic() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		homePagePF.clickGetStartedOnHomePage();
	}

	@Then("^user not logged in (.*) should be displayed$")
	public void user_not_logged_in_warning_message_should_be_displayed(String expectedWarning) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		homePagePF.validateWarningUserNotLoggedIn(expectedWarning);
	}


	 

}
