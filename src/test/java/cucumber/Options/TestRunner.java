package cucumber.Options;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features",
                 glue = { "stepDefinations" }, 
                 publish = true, 
                 plugin = { "pretty","html:target/CucumberReports/CucumberReport.html" })

public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}
