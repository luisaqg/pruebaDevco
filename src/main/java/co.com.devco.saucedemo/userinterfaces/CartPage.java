package co.com.devco.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    public static final Target ITEM = Target.the("Item").locatedBy("//div[@class='inventory_item_name']");
}
