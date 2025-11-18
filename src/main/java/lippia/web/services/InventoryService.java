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

    public static void agregarproducto() {
        waitPresence(InventoryConstants.FIRST_PRODUCT_XPATH);
        click(InventoryConstants.BUTTON_ADD_CART_XPATH);
    }

    public static void verifyAddedProduct() {
        waitPresence(InventoryConstants.CART_COUNTER_XPATH);
        Assert.assertEquals(getText(InventoryConstants.CART_COUNTER_XPATH), "1",
                "El contador del carrito no muestra 1");
    }

    public static void eliminarproducto() {
        waitVisibility(InventoryConstants.BUTTON_REMOVE_XPATH);
        click(InventoryConstants.BUTTON_REMOVE_XPATH);
    }

    //Cuando no hay elementos en el carrito el contador no aparece
    public static void verifyRemovedProduct() {
        Assert.assertFalse(isPresent(InventoryConstants.CART_COUNTER_XPATH),
                "El contador del carrito debería NO estar presente");
    }
}