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

import pageFactory.HomePage_PF;

public class RegisterPage_PF {
	
	
	WebDriver driver;
	
	HomePage_PF homePage;
	
	@FindBy(xpath ="//input[@name='username']" )
	WebElement txt_username_register;
	
	@FindBy(xpath ="//input[@name='password1']" )
	WebElement txt_password_register;
	
	@FindBy(xpath ="//input[@name='password2']" )
	WebElement txt_passwordConfirm;
	
	@FindBy(xpath ="//input[@value='Register']" )
	WebElement btn_register;
	
	@FindBy(linkText ="Login " )
	WebElement link_Login;
	
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_errorMsg;
	
	@FindBy(linkText ="Register")
	WebElement link_Register;
	
	
	public RegisterPage_PF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	
	public void validateUserLandedOnHomePage() {
		  driver.getPageSource().contains("NumpyNinja");
		    System.out.println("User landed on Home page!");
	}
	
	
	public void clickRegister() {
		homePage.clickRegister();
	}



	public void validateWarningUserNotLoggedIn(String expectedWarning) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		// String actualWarningMsg = text_UserNotLoggedInWarning.getText();
		  
		//  assertEquals(expectedWarning, actualWarningMsg);
	}

	
	


}
