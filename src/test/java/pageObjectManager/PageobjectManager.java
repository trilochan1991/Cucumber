package pageObjectManager;

import org.openqa.selenium.WebDriver;

import pageObjects.FacebookLogin;
import pageObjects.FacebookLoginregistration;

public class PageobjectManager {
	
	public WebDriver driver;
	
	private FacebookLogin facebookLogin;
	private FacebookLoginregistration facebookLoginregistration;
	
	public PageobjectManager(WebDriver driver){
		
		this.driver = driver;		
	}
	
	public FacebookLogin getFacebookLogin_Page(){
		
		return (facebookLogin == null)? facebookLogin = new FacebookLogin(driver) : facebookLogin;
	}
	
    public FacebookLoginregistration getFacebookLoginregistration_Page(){
		
		return (facebookLoginregistration == null)? facebookLoginregistration = new FacebookLoginregistration(driver) : facebookLoginregistration;
	}

}
