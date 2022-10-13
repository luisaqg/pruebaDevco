package co.com.devco.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/use_cart.feature",
        glue = {"co.com.devco.saucedemo.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class UseCart {

}
