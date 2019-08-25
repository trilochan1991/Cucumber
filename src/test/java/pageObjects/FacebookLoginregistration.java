package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extension.Extension;

public class FacebookLoginregistration {
	
	private WebDriver driver;
	
	public FacebookLoginregistration(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	     this.driver = driver;
	 }
	 
	 @FindBy(name = "firstname") 
	 private WebElement Firstname;	 
	 
	 public void enterFirstName(String value) throws InterruptedException
	 {
		 //sendkey(driver, Firstname, value );
		 Extension.sendKey(driver, Firstname, value);
	 }
	 	
	 public void sendkey(WebDriver driver, WebElement element, String value){
		 
		 element.sendKeys(value);
		 driver.findElement((By.name("email"))).sendKeys("xyz");
	 }

}
