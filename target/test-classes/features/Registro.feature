@RegistroUsuarios
Feature: Registrar usuarios de prueba
 El analista requiere registrar nuevos usuarios en la plataforma
  
  
  Scenario: Registro nuevos usuarios
    Given Valen abre la pagina
    And Ingresa los campos para registrar un nuevo usuario
     | correo 							| clave    |
     | valentina@gmail.com  | 43753400 |
    When Registra un nuevo usuario con los siguientes datos
      | titulo | nombre    | apellido | correo              | clave    | direccion            | ciudad         | estado   | codigoPostal | Pais          | Celular    |
      |    Mrs | Valentina | Giraldo  | valentina@gmail.com | 43753400 | Cll 9c sur N 54 - 67 | Estados Unidos | New York | 00004        | United States | 3113563929 | 
   Then Visualiza el nombre del usuario 