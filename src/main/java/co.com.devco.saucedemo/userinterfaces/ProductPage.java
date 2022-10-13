package co.com.devco.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {

    public static final Target ADD_CART = Target.the("Add cart").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target CART = Target.the("Cart").locatedBy("//a[@class='shopping_cart_link']");
}
