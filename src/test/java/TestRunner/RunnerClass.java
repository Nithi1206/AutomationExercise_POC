package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Feature"},
        glue = {"StepDef26","Hooks"},
        dryRun = !true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@fea26"

)

public class RunnerClass {
}
