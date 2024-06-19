package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/htmlReports/testReport.html"}, //reporting purpose
			monochrome=false,  //console output colour
			tags = "@Failed", //tags from feature file
			features = {"src/test/resources/features/DSAlgo_Login.feature"}, //location of feature files
			glue= "stepDefinitions") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();	
	    }

	
}
