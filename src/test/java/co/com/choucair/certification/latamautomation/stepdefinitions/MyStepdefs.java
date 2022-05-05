package co.com.choucair.certification.latamautomation.stepdefinitions;

import co.com.choucair.certification.latamautomation.model.LatamData;
import co.com.choucair.certification.latamautomation.questions.Validate;
import co.com.choucair.certification.latamautomation.tasks.FligthsPage;
import co.com.choucair.certification.latamautomation.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MyStepdefs {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast()); }

    @Given("^que Johnathan ingresa a la pagina de latamairlines$")
    public void queJohnathanIngresaALaPaginaDeLatamairlines() {
        OnStage.theActorCalled("").wasAbleTo(OpenUp.page());
    }


    @When("^Ingresa el Origen y el destino$")
    public void buscaLaOpcionMedellinEnElCampoOrigen(List<LatamData> latamDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(FligthsPage.section(latamDataList.get(0)));
    }

    @Then("^Verifica que se seleccionen los dos campos$")
    public void verificaQueSeSeleccioneUnaDeLasDosOpciones() {
        OnStage.theActorInTheSpotlight().should(seeThat("Resultado de busqueda",
                Validate.toThe(), Matchers.equalTo("Resumen de tu viaje")));
    }
}

