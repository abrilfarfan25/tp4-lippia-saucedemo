@Carrito
Feature: Carrito de compras

  Background:
    Given el usuario ingresa con usuario standard_user y contraseña secret_sauce
    And el usuario hace click en el boton "Login"

  @Agregar_producto_exitosamente
  Scenario: Agregar un producto al carrito
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Then el contador del carrito muestra "1"

  @Eliminar_producto_desde_inventory
  Scenario: Eliminar un producto
    Given el usuario agrega el producto "Sauce Labs Backpack" al carrito
    When el usuario hace click en el botón "Remove"
    Then el contador del carrito muestra "0"

