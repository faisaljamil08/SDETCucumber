package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/java/Features"},
glue= {"StepDefination"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestRun extends AbstractTestNGCucumberTests {

}  
