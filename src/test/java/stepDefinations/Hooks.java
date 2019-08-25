package stepDefinations;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import textContext.TextContext;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TextContext TextContext;
	
	public Hooks(TextContext TextContext)
	{
		this.TextContext = TextContext;
		
	}
	
	@Before(order = 0)	
	public void beforeTest()
	{
		Reporter.assignAuthor("Trilochan Pradhan");		
		TextContext.getwebdriverManager().getDriver();
		TextContext.getwebdriverManager().setup();
		
	}
		
	@After(order = 1)
	public void capturescreenShot(Scenario scenraio)
	{
		if(scenraio.isFailed())
		{
			String screenshotName = scenraio.getName().replaceAll(" ", "_");
			try
			{
				 File sourcePath = ((TakesScreenshot) TextContext.getwebdriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				 
				 //Building up the destination path for the screenshot to save
				 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				 
				 //Copy taken screenshot from source location to destination location
				 Files.copy(sourcePath, destinationPath);   
				 
				 //This attach the specified screenshot to the test
				 Reporter.addScreenCaptureFromPath(destinationPath.toString());
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
	
	@After(order = 0)
	public void AfterTest()
	{		
		TextContext.getwebdriverManager().Teardown();
		Reporter.addStepLog("My driver has been closed successfuly");
	}

}
