package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.InventoryService;
import lippia.web.services.LoginService;

public class InventorySteps extends PageSteps {
    @Then("^el usuario visualiza la Homepage$")
    public void homepage() {
        InventoryService.verifyHomePage();
    }

    @When("^el usuario agrega el producto \"Sauce Labs Backpack\" al carrito$")
    public void agregar_product() {
        InventoryService.agregarproducto();
    }

    @Then("^el contador del carrito muestra \"1\"$")
    public void producto_agregado() {
        InventoryService.verifyAddedProduct();
    }

    @When("^el usuario hace click en el botón \"Remove\"$")
    public void eliminar_product() {
        InventoryService.eliminarproducto();
    }

    @Then("^El usuario verifica que no existen productos agregados en el carrito$")
    public void producto_eliminado() {
        InventoryService.verifyRemovedProduct();
    }

}