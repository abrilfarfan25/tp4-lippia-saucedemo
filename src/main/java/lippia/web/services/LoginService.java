package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {
    public static void navegarWeb() {

        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void completarUserandPassParams(String user, String pass) {
        setInput(LoginConstants.INPUT_USERNAME_XPATH, user);
        setInput(LoginConstants.INPUT_PASSWORD_XPATH, pass);
    }

    public static void clickLoginButton() {
        click(LoginConstants.BUTTON_LOGIN_XPATH);
    }

    public static void visualizarMensajeError(String mensajeEsperado) {
        waitPresence(LoginConstants.TEXT_MESSAGE_XPATH);
        String mensajeActual = getText(LoginConstants.TEXT_MESSAGE_XPATH);
        Assert.assertEquals(
                mensajeActual,
                mensajeEsperado,
                "El mensaje de error no coincide"
        );
    }


}