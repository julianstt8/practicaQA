package co.com.chocucair.certification.retoTecnico.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demo.feature",
        tags = "@tag1",
        glue = "co.com.chocuair.certificacion.retoTecnico.stepdefinitions",snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
