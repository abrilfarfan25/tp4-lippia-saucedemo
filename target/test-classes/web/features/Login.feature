@Login
Feature: Login soucedemo

  @LoginExitoso
  Scenario: Login exitoso con credenciales validas
    Given el usuario ingresa con usuario standard_user y contraseña secret_sauce
    When el usuario hace click en el boton "Login"
    Then el usuario visualiza la Homepage

  @LoginFallido
  Scenario: Login fallido
    Given el usuario ingresa con usuario locked_out_user y contraseña secret_sauce
    When el usuario hace click en el boton "Login"
    Then el usuario visualiza el mensaje de error