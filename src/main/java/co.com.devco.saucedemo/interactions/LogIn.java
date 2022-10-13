package co.com.devco.saucedemo.interactions;

import co.com.devco.saucedemo.utils.DirectionsConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.saucedemo.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogIn implements Interaction {


    public static LogIn sucessful() {
        return Tasks.instrumented(LogIn.class);
    }

    @Step("{0} goes to enter the credentials")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(USERNAME_INPUT,  isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(DirectionsConstants.USERNAME).into(USERNAME_INPUT),
                Enter.keyValues(DirectionsConstants.PASSWORD).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON));
    }
}
