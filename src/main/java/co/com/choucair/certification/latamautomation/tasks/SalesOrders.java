package co.com.choucair.certification.latamautomation.tasks;

import co.com.choucair.certification.latamautomation.userinterface.SalesOrdersInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SalesOrders implements Task {
    public static SalesOrders orderSections() {
        return Tasks.instrumented(SalesOrders.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SalesOrdersInterface.SALES_BUTTON),
                Click.on(SalesOrdersInterface.ORDERS_BUTTON),
                Click.on(SalesOrdersInterface.VIEW_BUTTON),
                Click.on(SalesOrdersInterface.LABEL_ORDER)

        );
    }
}
