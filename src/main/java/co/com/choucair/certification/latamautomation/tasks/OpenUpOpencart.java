package co.com.choucair.certification.latamautomation.tasks;


import co.com.choucair.certification.latamautomation.userinterface.Opencarthome;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpOpencart extends PageObject implements Task {

    private Opencarthome opencarthome;

    public static OpenUpOpencart page(){

        return Tasks.instrumented(OpenUpOpencart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(opencarthome));

    }
}