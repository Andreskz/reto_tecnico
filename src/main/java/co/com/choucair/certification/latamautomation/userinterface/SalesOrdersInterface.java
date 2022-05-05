package co.com.choucair.certification.latamautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SalesOrdersInterface extends PageObject {

    public static final Target SALES_BUTTON = Target.the("boton sales").
            located(By.xpath("//a[contains(text(),'Sales')]"));
    public static final Target ORDERS_BUTTON = Target.the("boton orders").
            located(By.xpath("//a[contains(text(),'Orders')]"));
    public static final Target VIEW_BUTTON = Target.the("boton orders").
            located(By.xpath("(//i[@class='fa fa-eye'])[1]"));
    public static final Target LABEL_ORDER = Target.the("visualizacion orden")
            .located(By.xpath("//h1[contains(text(),'Orders')]"));



}
