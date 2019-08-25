package testRunners;

import java.io.File;
import java.time.format.DateTimeFormatter;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/java/features/FacebookInvalidTest.feature", //the path of the feature files
			glue={"stepDefinations"}, //the path of the step definition files
			//plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false, //to check the mapping is proper between feature file and step def file
			tags = "@Facebook"			
			)

public class GoogleLoginrunner {

		@AfterClass
		 public static void writeExtentReport() {
		 Reporter.loadXMLConfig(new File("src/main/java/Config/config.xml"));
		 Reporter.setSystemInfo("application Name", "secondary Marketing");
		 Reporter.setSystemInfo("URL", "http//secondary Marketing");
		 Reporter.setSystemInfo("Time Zone",  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").toString());
		 Reporter.setSystemInfo("Java Version",  "JDK 8");
		 Reporter.setSystemInfo("Frame Work",  "Cucumber");
		 
		 }
}
