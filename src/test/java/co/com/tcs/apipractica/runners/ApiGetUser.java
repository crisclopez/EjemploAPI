package co.com.tcs.apipractica.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\api_get.feature",
        glue = "co.com.tcs.apipractica.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@scenario1"
)
public class ApiGetUser {
}
