package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:Reports/22june/report.html","json:Reports/22june/report.json"},
		glue= {"StepDefinition"},
		features= {"src/test/resources/Features/practice1.feature"}
		
		)

public class practice1testrunner extends AbstractTestNGCucumberTests {

}