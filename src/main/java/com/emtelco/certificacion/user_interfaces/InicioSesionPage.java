package com.emtelco.certificacion.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionPage {

	public static final Target INICIOSESION = Target.the("inicio de sesion").locatedBy("//a[@class='login']");

	public static final Target CORREO = Target.the("correo").locatedBy("//input[@id='email']");
	
	public static final Target CLAVE = Target.the("clave").locatedBy("//input[@id='passwd']");
	
	public static final Target BOTONLOGIN = Target.the("boton de logueo").locatedBy("//button[@id='SubmitLogin']");
	
	public static final Target VISUALIZACION = Target.the("visualizacion usuario logueado").locatedBy("//a[@class='account']");
	
}
	