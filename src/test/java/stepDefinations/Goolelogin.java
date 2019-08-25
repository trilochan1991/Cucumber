package stepDefinations;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Goolelogin {
	public static WebDriver driver;
	
	@Given("^enter username$")
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		
	}
	@When("^enter password$") 
	public void enterUserName(){
		System.out.println("Enter User Name");
	}
	
	@Then("^click on login$") 
	public void enterPassword()
	{
		System.out.println("enter password");
	}
	
	@Then("^user navigate to login home page$")
	public void clicklogin()
	{
		System.out.println("click on login");
	}
	
	@Then("^Close the browser$") 
	public void tearDown(){
		driver.quit();
	}

}
