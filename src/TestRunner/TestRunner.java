package TestRunner;
 
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepdefinition"}
//		, format = {"pretty", "html:target/Destination"}
//		, plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
//		, tags = { "~@ignore" }
		, tags = {"@smoke"}
		)
 
public class TestRunner {
	public static void main(String[] args)
	{
		JUnitCore.main("Cucumber.TestRunner");
	}

}