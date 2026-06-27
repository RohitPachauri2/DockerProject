package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		dryRun=false,
		monochrome=true,
		glue= {"Hooks","StepDefinition"},
		features= {"src/test/resources/Features/practice2.feature"},
		plugin= {"pretty","html:Report/report.html","json:Report/report.json"}
		
		
		)

public class practice2testrunner extends AbstractTestNGCucumberTests{

}
