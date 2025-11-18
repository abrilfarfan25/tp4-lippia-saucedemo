package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import lippia.web.services.InventoryService;

public class InventorySteps extends PageSteps {
    @Then("^el usuario visualiza la Homepage$")
    public void homepage() {
        InventoryService.verifyHomePage();
    }
}