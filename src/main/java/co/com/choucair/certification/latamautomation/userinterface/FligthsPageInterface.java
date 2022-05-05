package co.com.choucair.certification.latamautomation.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FligthsPageInterface extends PageObject {
    public static final Target ORIGIN_INPUT = Target.the("origen").
            located(By.id("txtInputOrigin_field"));
    public static final Target ORIGIN_CLICK = Target.the("origen").
            located(By.id("btnItemAutoComplete_0"));

    public static final Target DESTINY_INPUT = Target.the("destino").
            located(By.id("txtInputDestination_field"));
    public static final Target DESTINY_CLICK = Target.the("destino").
            located(By.cssSelector("#btnItemAutoComplete_0"));


    public static final Target IDA_CLICK = Target.the("fechaida").
            located(By.id("departureDate"));

    public static final Target NUM_CLICK = Target.the("numeroida").
            located(By.xpath("//td[@aria-label='Elija miércoles, 15 de junio de 2022 como su fecha de ida. Está disponible.']"));

    public static final Target NUM2_CLICK = Target.the("numerovuelta").
            located(By.xpath("//td[@aria-label='Elija martes, 21 de junio de 2022 como fecha de vuelta. Está disponible.']"));

    public static final Target BUTTON_SEARCH = Target.the("buscar").
            located(By.id("btnSearchCTA"));
    public static final Target LABEL = Target.the("resultado busqueda")
            .located(By.cssSelector("#WrapperBodyCart > h2"));
}



