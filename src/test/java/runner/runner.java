package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(features = ".\\src\\test\\java\\practiceFeature\\login.feature",glue = ".\\BDD\\src\\test\\java\\StepDotFile\\LoginToApp.java"
		
		)

public class runner extends AbstractTestNGCucumberTests {
	

}
