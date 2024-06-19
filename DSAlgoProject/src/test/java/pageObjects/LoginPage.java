package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username_login = By.xpath("//input[@name='username']");
	By txt_password_login = By.xpath("//input[@name='password']");
	By btn_login = By.xpath("//input[@value='Login']");
	By link_register = By.xpath("//div[2]/div/div[2]/a");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		if(!driver.getTitle().equals("Login"))
		{
			throw new IllegalStateException("This is Not Login page.The current page is:" +driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password_login).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		driver.findElement(btn_login).click();
	}
	
	public void clickRegisterLink() {
		driver.findElement(link_register).click();
		String url = driver. getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/register", url);
		System.out.println("User navigated to Register page!");
	}
	
	public void validateErrorMsg(String errorMessage) {
		
		String actualMsg = driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		  
		  assertEquals(actualMsg,errorMessage);
		  System.out.println("Error Displayed!");
	}
	

	public void validateToolTipErrorMsg(String errorMessage) {
		  
		  // Create action class object
		 // Actions builder=new Actions(driver);

		  // find the tooltip xpath
		  WebElement tooltip= driver.findElement(txt_username_login);
		  // Mouse hover to that text message
		  //builder.moveToElement(tooltip).build().perform();
		  // Extract text from tooltip
			/*
			 * String tooltip_msg=tooltip.getAttribute("required");
			 * 
			 * // Print the tooltip message just for our refrences
			 * System.out.println("Tooltip message is "+tooltip_msg);
			 * assertEquals(tooltip_msg,errorMessage);
			 */
		  
		  isAttribtuePresent(tooltip, "required");
		  System.out.println("Attribute in webelement >>>>"+tooltip.getAttribute("required"));
	}
		   
		 //to verify tooltip message   
		   public boolean isAttribtuePresent(WebElement element, String attribute) {
			   Boolean result = false;
			   try {
			   String value = element.getAttribute(attribute);
			   if (value != null){
			   result = true;
			     }
			   } catch (Exception e) {}
			   return result;
	}
}
