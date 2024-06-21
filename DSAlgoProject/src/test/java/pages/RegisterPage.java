	package pages;

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

import pages.HomePage;

public class RegisterPage {
	
	
	WebDriver driver;
	
	HomePage homePage;
	
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
	
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_successMsg;
	
	@FindBy(linkText ="Register")
	WebElement link_Register;
	
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String username) {
		txt_username_register.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password_register.sendKeys(password);
	}
	
	public void enterPasswordConfirmation(String passwordConfirm) {
		txt_passwordConfirm.sendKeys(passwordConfirm);
	}
	
	public void clickRegisterBtn() {
		btn_register.click();
	}



	public void validateWarningUserNotLoggedIn(String expectedWarning) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		// String actualWarningMsg = text_UserNotLoggedInWarning.getText();
		  
		//  assertEquals(expectedWarning, actualWarningMsg);
	}

	
	


}
