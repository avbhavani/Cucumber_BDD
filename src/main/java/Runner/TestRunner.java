package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
features ="C:\\Users\\avsub\\eclipse-workspace\\FreecrmBDDFramework\\src\\main\\java\\features", //the path of the feature files
glue={"stepDefinitions"},//the path of the step definition files

monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
 //display the console output in a proper readable format
			)
	
	public class TestRunner {

}
