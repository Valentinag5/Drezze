package com.emtelco.certificacion.tasks;

import static com.emtelco.certificacion.user_interfaces.InicioSesionPage.BOTONLOGIN;
import static com.emtelco.certificacion.user_interfaces.InicioSesionPage.CLAVE;
import static com.emtelco.certificacion.user_interfaces.InicioSesionPage.CORREO;
import static com.emtelco.certificacion.user_interfaces.InicioSesionPage.INICIOSESION;

import java.util.List;

import com.emtelco.certificacion.models.InicioSesionModel;
import com.emtelco.certificacion.user_interfaces.InicioSesionPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InicioSesionTask implements Task {
	
	private InicioSesionModel campos;

	public InicioSesionTask(List<InicioSesionModel> campos) { // constructor
		this.campos = campos.get(0);
	}
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(INICIOSESION),
				Enter.theValue(campos.getCorreo()).into(CORREO),
				Enter.theValue(campos.getClave()).into(CLAVE),
				Click.on(BOTONLOGIN));

		
	}

	public static InicioSesionTask conLosCampos(List<InicioSesionModel> campos) {
		return Tasks.instrumented(InicioSesionTask.class, campos);
	}
}
