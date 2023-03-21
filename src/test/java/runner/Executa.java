package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resourses/features",
		glue = "steps",
		tags = "@aula",
		dryRun = true,
		monochrome = true,
		plugin = {"pretty","html:target/report-cucumber.html"},
		snippets = SnippetType.CAMELCASE
		)
		
public class Executa {

}
