@InicioSesion
Feature: Inicio de Sesion
  El analista debe iniciar sesion con uno de los usuarios de prueba creados


  Scenario: Inicio Sesion
    Given Valen abre la pagina
    When Ingresa los campos para iniciar sesion
    | correo 							| clave    |
    | valentina@gmail.com | 43753400 |
   Then Visualiza el nombre del usuario