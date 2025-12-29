@Login
Feature: Login soucedemo

 ## @Smoke_LoginExitoso
 ## Scenario: Login exitoso con credenciales validas
 ##   Given el usuario ingresa con usuario standard_user y contraseña secret_sauce
 ##   When el usuario hace click en el boton "Login"
 ##   Then el usuario visualiza la Homepage

 ## @Smoke_LoginFallido
 ## Scenario: Login fallido
 ##   Given el usuario ingresa con usuario locked_out_user y contraseña secret_sauce
 ##   When el usuario hace click en el boton "Login"
 ##   Then el usuario visualiza el mensaje de error

  @Regresion_Login
  Scenario Outline: Login exitoso con diferentes usuarios
    Given el usuario ingresa con usuario <usuario> y contraseña <password>
    When el usuario hace click en el boton "Login"
    Then el usuario visualiza la Homepage

    Examples:
      | usuario                   | password       |
      | standard_user             | secret_sauce   |
      | visual_user               | secret_sauce   |
      | error_user                | secret_sauce   |
      | performance_glitch_user   | secret_sauce   |
      | problem_user              | secret_sauce   |

  @Regresion_LoginFallido
  Scenario Outline: Login fallido con diferentes usuarios
    Given el usuario ingresa con usuario <usuario> y contraseña <password>
    When el usuario hace click en el boton "Login"
    Then el usuario visualiza el mensaje de error "<mensaje_error>"

    Examples:
      | usuario          | password      | mensaje_error |
      | locked_out_user  | secret_sauce  | Epic sadface: Sorry, this user has been locked out. |
      | abrilfarfan      | secret_sauce  | Epic sadface: Username and password do not match any user in this service |

