@Checkout
Feature: Compra de productos completa

  Background:
    Given el usuario ingresa con usuario standard_user y contraseña secret_sauce
    And el usuario hace click en el boton "Login"
    And el usuario agrega dos productos al carrito

  @Compra_completa
  Scenario: Compra completa y validación de datos
    When el usuario inicia el checkout
    And el usuario completa los datos personales nombre Abril apellido Farfan codigo 4139
    Then el usuario visualiza el resumen de la compra
    And el resumen de compra es el correcto
    And el usuario visualiza el mensaje de compra exitosa

