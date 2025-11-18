@Carrito
Feature: Carrito de compras

  @Agregar_producto_exitosamente
  Scenario: Agregar un producto al carrito
    Given el usuario ingresa con usuario standard_user y contraseña secret_sauce
    And el usuario hace click en el boton "Login"
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Then el contador del carrito muestra "1"

  @Eliminar_producto_desde_carrito
  Scenario: Eliminar un producto desde el carrito
    Given el usuario ingresa con usuario standard_user y contraseña secret_sauce
    And el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And el usuario ingresa al carrito
    When hace click en el botón "Remove"
    Then el contador del carrito muestra "0"

