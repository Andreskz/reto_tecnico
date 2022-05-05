package co.com.choucair.certification.latamautomation.questions;

import co.com.choucair.certification.latamautomation.userinterface.FligthsPageInterface;
import co.com.choucair.certification.latamautomation.userinterface.SalesOrdersInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateOrders implements Question<String> {

    public static ValidateOrders toThe() {
        return new ValidateOrders();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SalesOrdersInterface.LABEL_ORDER).viewedBy(actor).asString();
    }



}
