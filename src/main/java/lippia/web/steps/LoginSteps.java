package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.InventoryService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    @Given("^el usuario ingresa con usuario (.*) y contraseña (.*)$")
    public void login(String user, String pass) {
        LoginService.navegarWeb();
        LoginService.completarUserandPassParams(user,pass);
    }
    @When("^el usuario hace click en el boton \"Login\"$")
    public void click() {
        LoginService.clickLoginButton();
    }
    @Then("^el usuario visualiza el mensaje de error$")
    public void mensajeDeError() {
        LoginService.visualizarMensajeError();
    }

}