package com.emtelco.certificacion.stepdefinitions;

import static com.emtelco.certificacion.user_interfaces.InicioSesionPage.VISUALIZACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import com.emtelco.certificacion.models.InicioSesionModel;
import com.emtelco.certificacion.tasks.InicioSesionTask;
import com.emtelco.certificacion.utils.drivers.OwnWebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class InicioSesionStepDefinition {

	@Before
	public void init() {
		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Valen");
	}
	
	@Given("^(.*) abre la pagina$")
	public void valenAbreLaPagina(String nombre) {
		theActorInTheSpotlight()
		.can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("http://automationpractice.com/index.php")));
    }
	

	@When("^Ingresa los campos para iniciar sesion$")
	public void ingresaLosCamposParaIniciarSesion(List<InicioSesionModel> campos) {
	   theActorInTheSpotlight().attemptsTo(InicioSesionTask.conLosCampos(campos));
	}

	@Then("^Visualiza el nombre del usuario$")
	public void visualizaElNombreDelUsuario() {
		theActorInTheSpotlight()
		.should(seeThat(WebElementQuestion.stateOf(VISUALIZACION), WebElementStateMatchers.isVisible()));
	}

}
