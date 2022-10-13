package co.com.devco.saucedemo.tasks;

import co.com.devco.saucedemo.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchItem implements Task {

    public static SearchItem forFilter() {
        return Tasks.instrumented(SearchItem.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.CART));
    }
}
