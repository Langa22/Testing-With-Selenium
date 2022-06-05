package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@testOne",glue = "StepDefinition.java",plugin = {"pretty", "html:target/Report.html"})
public class TestRunner {
}
