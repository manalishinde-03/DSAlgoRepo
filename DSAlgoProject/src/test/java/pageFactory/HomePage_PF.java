package pageFactory;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath ="//ul/a[3]" )
	WebElement link_SignOut;
	
	@FindBy(linkText ="Sign in" )
	WebElement link_SignIn;
	
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_loginSuccessMsg;
	
	@FindBy(xpath ="//ul/a[2]" )
	WebElement text_username;
	
	@FindBy(xpath ="//button[text()='Get Started']" )
	WebElement btn_GetStarted;
	@FindBy(xpath ="//a[@class='nav-link dropdown-toggle']" )
	WebElement dropDownDataStructures;
	@FindBy(xpath ="//div/a[@class='dropdown-item']" )
	List<WebElement> dropDownDataStructuresValues;
	@FindBy(linkText ="Register")
	WebElement link_Register;
	@FindBy(linkText ="Get Started")
	WebElement btn_GetStartedHome;
	@FindBy(xpath ="//form[@method='post']" )
	WebElement registrationForm;
	@FindBy(xpath ="//form[@method='post']" )
	WebElement loginForm;
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_UserNotLoggedInWarning;
	
	
	public HomePage_PF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void validateMsgAfterLogin(String message) {
		String actualMsg = text_loginSuccessMsg.getText();
		  
		  assertEquals(actualMsg,message);
		  System.out.println("Login Successful!");
	}
	
	public void validateUserLandedOnHomePage() {
		  driver.getPageSource().contains("NumpyNinja");
		    System.out.println("User landed on Home page!");
	}
	
	public void validateDataStrucruesDropdown() {
		dropDownDataStructures.click();
		   
		List <WebElement> dsOptions = dropDownDataStructuresValues;
		String expectedOptions [] = {"Arrays", "Linked List","Stack","Queue","Tree","Graph"};
		
		for (int i = 0; i < dsOptions.size(); i++) {
			dsOptions.get(i).getText();
			Assert.assertEquals(dsOptions.get(i).getText(), expectedOptions[i]);
		}
	}
	public void clickSignIn() {
		link_SignIn.click();
		loginForm.isDisplayed();
		System.out.println("User landed on Login page!");
	}
	public void clickSignOut() {
		link_SignOut.click();
	}
	public void clickGetStartedOnHomePage() {
		btn_GetStartedHome.click();
	}
	public void clickRegister() {
		link_Register.click();
		registrationForm.isDisplayed();
		System.out.println("User landed on Register page!");
	}

	public void verifyUsernameSignOutLinkOnHomePage(String username) {
		 String actualUserName = text_username.getText();
		  String usernameLowerCase = actualUserName.toLowerCase();
		  
		  assertEquals( usernameLowerCase,username);
		  System.out.println("Username is displayed on Home page");
		  
		  if(link_SignOut.isDisplayed()) {
				System.out.println("Sign out link is displayed");
			} else {
				System.out.println("Sign out link is NOT displayed");
			}
	}
	public void validateWarningUserNotLoggedIn(String expectedWarning) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 String actualWarningMsg = text_UserNotLoggedInWarning.getText();
		  
		  assertEquals(expectedWarning, actualWarningMsg);
	}

	public void clickGetStartedBtn() {
		btn_GetStarted.click();
	}
	


}
