package co.com.choucair.certification.latamautomation.stepdefinitions;


import co.com.choucair.certification.latamautomation.model.LatamData;
import co.com.choucair.certification.latamautomation.tasks.LoginOpencart;
import co.com.choucair.certification.latamautomation.tasks.OpenUpOpencart;
import co.com.choucair.certification.latamautomation.tasks.SalesOrders;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class OpenCartStepsDefinitios {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast()); }

    @Given("^Johnathan necesita visitar la web opencart$")
    public void johnathanNecesitaVisitarLaWebOpencart()
    {
        OnStage.theActorCalled("").wasAbleTo(OpenUpOpencart.page());
    }

    @And("^el inicia sesion en el portal web$")
    public void elIniciaSesionEnElPortalWeb(List<LatamData> latamDataList) {
        OnStage.theActorCalled("").wasAbleTo(LoginOpencart.login(latamDataList.get(0)));
    }


    @When("^el da clic en el menú de ventas e ingresa a la seccion de ordenes para visualizar una orden$")
    public void elDaClicEnElMenúDeVentasEIngresaALaSeccionDeOrdenesParaVisualizarUnaOrden() {
      OnStage.theActorInTheSpotlight().attemptsTo(SalesOrders.orderSections());
    }
}
