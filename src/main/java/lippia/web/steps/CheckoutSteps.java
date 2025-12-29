package lippia.web.steps;

import com.crowdar.core.PageSteps;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CheckoutService;

public class CheckoutSteps extends PageSteps {
    @When("el usuario inicia el checkout")
    public void iniciarElCheckout() {
        CheckoutService.iniciarCheckout();
    }

    @And("^el usuario completa los datos personales nombre (.*) apellido (.*) codigo (.*)$")
    public void completarLosDatosPersonales(String name, String lastname, String codepostal) {
        CheckoutService.completarDatos(name, lastname, codepostal);
    }

    @Then("el usuario visualiza el resumen de la compra")
    public void visualizaElResumenDeLaCompra() {
        CheckoutService.visualizarDetalleCompra();
    }

    @And("el resumen de compra es el correcto")
    public void validarResumenCompra() {
        CheckoutService.validarResumenCompra();
    }

    @And("el usuario visualiza el mensaje de compra exitosa")
    public void visualizarMensajeDeCompraExitosa() {
        CheckoutService.finalizarCompra();
    }
}
