package co.com.choucair.certification.latamautomation.questions;

import co.com.choucair.certification.latamautomation.userinterface.FligthsPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validate implements Question<String> {


    public static Validate toThe() {
        return new Validate();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FligthsPageInterface.LABEL).viewedBy(actor).asString();
    }
}
