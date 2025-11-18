package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.InventoryConstants;
import org.testng.Assert;

public class InventoryService extends ActionManager {
    public static void verifyHomePage() {
        waitPresence(InventoryConstants.TITLE_HOME_XPATH);
        //Realizo una espera explicita hasta que el elemento este presente
        Assert.assertTrue(getText(InventoryConstants.TITLE_HOME_XPATH).contains("Products"),"No se encuentra el elemento en la home");
        //Otra alternativa de validacion
        // Assert.assertEquals(getText(InventoryConstants.TITLE_HOME_XPATH),"Products","No se encuentra el elemento en la home");
        }
}