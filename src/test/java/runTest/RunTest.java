package runTest;


import commons.BaseTest;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        dryRun = false,
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", "json:target/cucumber.json", "json:target/cucumber-report/cucumber.json"},
        features = {"./src/test/resources/"},
        glue = {"steps", "configuration",
                "commons", "bean"},
        tags = "@ct001")


class RunTest extends BaseTest {

}
