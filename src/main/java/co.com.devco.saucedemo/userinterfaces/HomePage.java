package co.com.devco.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject {

    public static final Target USERNAME_INPUT = Target.the("Username input").locatedBy("//input[@id='user-name']");
    public static final Target PASSWORD_INPUT = Target.the("Password input").locatedBy("//input[@id='password']");
    public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("//input[@id='login-button']");
}
