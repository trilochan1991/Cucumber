package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import dataProvider.ExtenntReport;
import extension.Extension;

public class FacebookLogin {
	
	private WebDriver driver;
	ExtenntReport extenntReport;
	
	public FacebookLogin(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	     this.driver = driver;
	 }
	 
	 @FindBy(name = "email") 
	 private WebElement txtUserName;
	 	 
	 @FindBy(name = "pass") 
	 private WebElement txtPass;
	 		 	 
	 @FindBy(id = "loginbutton") 
	 private WebElement btnLogin;
	 
	 @FindBy(name = "firstname") 
	 private WebElement Firstname;
	 
	 public void enterusername()
	 {
		 sendkey(driver, txtUserName, "trilochan" );
		 Reporter.addStepLog("Entered successfully");
	 }
	 
	 public String Readusername()
	 {
		  return txtUserName.getAttribute("id");
	 }
	 
	 public void enterpassword() throws InterruptedException
	 {
		 //sendkey(driver, txtPass, "trilochan" );
		 Extension.sendKey(driver, txtPass, "trilochan");
	 }
	 
	 public void enterFirstName(String value) throws InterruptedException
	 {
		 //sendkey(driver, Firstname, value );
		 Extension.sendKey(driver, Firstname, value);
	 }
	 
	 public void clickSignin()
	 {
		 btnLogin.click();		 
		 
	 }
	 
	 
	 public void sendkey(WebDriver driver, WebElement element, String value){
		 
		 element.sendKeys(value);
		 driver.findElement((By.name("email"))).sendKeys("xyz");
	 }

}
