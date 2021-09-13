package cucumberOptions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ValidateBrand.feature"
		,glue={"stepDefinitions"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}