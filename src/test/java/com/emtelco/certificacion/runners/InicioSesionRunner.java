package com.emtelco.certificacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/InicioSesion.feature",
		glue= "com.emtelco.certificacion.stepdefinitions",
		snippets=SnippetType.CAMELCASE,
		tags="@InicioSesion"
		)

public class InicioSesionRunner {

}
