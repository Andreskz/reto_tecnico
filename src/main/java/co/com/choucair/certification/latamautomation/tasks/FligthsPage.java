package co.com.choucair.certification.latamautomation.tasks;

import co.com.choucair.certification.latamautomation.model.LatamData;
import co.com.choucair.certification.latamautomation.userinterface.FligthsPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FligthsPage implements Task {
    public FligthsPage(LatamData latamData) {
        this.latamData = latamData;
    }

    private LatamData latamData;

    public static FligthsPage section(LatamData latamData) {
        return Tasks.instrumented(FligthsPage.class, latamData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(latamData.getOrigen()).into(FligthsPageInterface.ORIGIN_INPUT),
                Click.on(FligthsPageInterface.ORIGIN_CLICK),

                Enter.theValue(latamData.getDestino()).into(FligthsPageInterface.DESTINY_INPUT),
                Click.on(FligthsPageInterface.DESTINY_CLICK),

                Click.on(FligthsPageInterface.IDA_CLICK),
                Click.on(FligthsPageInterface.NUM_CLICK),
                Click.on(FligthsPageInterface.NUM2_CLICK),
                Click.on(FligthsPageInterface.BUTTON_SEARCH)

        );
    }
}
