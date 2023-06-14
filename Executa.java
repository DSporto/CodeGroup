package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/feature",
		glue = "steps",
		tags = "@tag1",
		monochrome = false,
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "json:target/login"}
		
		)



public class Executa {

	
}
