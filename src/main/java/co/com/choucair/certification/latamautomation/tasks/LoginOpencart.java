package co.com.choucair.certification.latamautomation.tasks;

import co.com.choucair.certification.latamautomation.model.LatamData;
import co.com.choucair.certification.latamautomation.userinterface.LoginOpenCartInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginOpencart implements Task  {
    public LoginOpencart(LatamData latamData) {
        this.latamData = latamData;
    }

    private LatamData latamData;
    public static LoginOpencart login(LatamData latamData) {
        return Tasks.instrumented(LoginOpencart.class, latamData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(latamData.getUsername()).into(LoginOpenCartInterface.USER_INPUT),
                Enter.theValue(latamData.getPassword()).into(LoginOpenCartInterface.PASS_INPUT),
                Click.on(LoginOpenCartInterface.LOGIN_BUTTON)

        );
    }
}
