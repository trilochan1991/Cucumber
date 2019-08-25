package extension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.ExtentProperties;


public class Extension {
		
	public static void sendKey(WebDriver driver, WebElement element, String value) throws InterruptedException
	{
		element.sendKeys("extension");
		Thread.sleep(3000);
		element.clear();
		Thread.sleep(3000);
		element.sendKeys(value);
		Thread.sleep(3000);
	}
	
	
	public static void logger()
	{
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.getReportPath();
	}

}
