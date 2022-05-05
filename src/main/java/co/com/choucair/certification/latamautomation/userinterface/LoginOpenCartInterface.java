package co.com.choucair.certification.latamautomation.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginOpenCartInterface extends PageObject {

    public static final Target USER_INPUT = Target.the("username").
            located(By.id("input-username"));
    public static final Target PASS_INPUT = Target.the("password").
            located(By.id("input-password"));
    public static final Target LOGIN_BUTTON = Target.the("login").
            located(By.xpath("//button[contains(text(),'Login')]"));
}
