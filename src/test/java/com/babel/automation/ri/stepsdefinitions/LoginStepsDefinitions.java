package com.babel.automation.ri.stepsdefinitions;

import com.babel.automation.ri.models.CredencialesLogin;
import com.babel.automation.ri.questions.MensajeDeLogin;
import com.babel.automation.ri.tasks.AbreLaWeb;
import com.babel.automation.ri.tasks.HaceLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinitions {

    @Given("^Que (.*) esta en la web de registro inmobiliario$")
    public void queEstaEnLaWebDeRegistroInmobiliario(String nombre){
        theActorCalled(nombre).wasAbleTo(AbreLaWeb.newTours());
    }

    @When("^Diligencia el formulario del ingreso a la web$")
    public void diligenciaElFormularioDelIngresoAlaWeb(List<CredencialesLogin> cred){
        theActorInTheSpotlight().attemptsTo(HaceLogin.correctamenteEnLaWeb(cred.get(0)));
    }

    @Then("^y vera el mensaje (.*)$")
    public void yVeraElMensaje(String msg){
        theActorInTheSpotlight().should(
                seeThat(MensajeDeLogin.bienvenida(msg), equalTo(msg))
        );
    }
}
