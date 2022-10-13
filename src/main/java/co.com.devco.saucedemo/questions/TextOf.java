package co.com.devco.saucedemo.questions;

import co.com.devco.saucedemo.userinterfaces.CartPage;
import co.com.devco.saucedemo.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextOf implements Question {

    private Target item;

    public TextOf(Target item) {
        this.item = item;
    }

    public String answeredBy(Actor actor) {

        return Text.of(item).answeredBy(actor).toString();
    }


    public static TextOf data(Target item){
        return new TextOf(item);
    }
}
