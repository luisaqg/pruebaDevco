package co.com.devco.saucedemo.stepdefinitions;

import co.com.devco.saucedemo.interactions.LogIn;
import co.com.devco.saucedemo.questions.TextOf;
import co.com.devco.saucedemo.tasks.SearchItem;
import co.com.devco.saucedemo.utils.DirectionsConstants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.devco.saucedemo.userinterfaces.CartPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UseCartStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void config() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new Cast());
        theActorCalled("User");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().wasAbleTo(Open.url(DirectionsConstants.CERTIFICATION_URL));
    }

    @Given("^The user logs in$")
    public void theUserLogsIn() {
        theActorInTheSpotlight().wasAbleTo(LogIn.sucessful());
    }

    @When("The user add item to the cart")
    public void heAddItToTheCart() {
        theActorInTheSpotlight().wasAbleTo(SearchItem.forFilter());

    }
    @Then("He sees the object added")
    public void heSeesTheObjectAdded() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.data(ITEM), Matchers.equalTo("Test.allTheThings() T-Shirt (Red)")));

    }
}
