package bdd.runners;

//import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"bdd.stepdefinitions", "bdd"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests {
	  // This method enables parallel run at scenario level
   // @Override
  //  @DataProvider(parallel = true)
  //  public Object[][] scenarios() {
  //      return super.scenarios();
  //  }

}
