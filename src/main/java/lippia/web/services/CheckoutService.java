package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.CheckoutConstants;
import lippia.web.constants.InventoryConstants;
import lippia.web.constants.LoginConstants;

public class CheckoutService extends ActionManager {

    public static void iniciarCheckout() {
        click(CheckoutConstants.BUTTON_CARRITO_XPATH);
        waitPresence(CheckoutConstants.BUTTON_CHECKOUT_XPATH);
        click(CheckoutConstants.BUTTON_CHECKOUT_XPATH);
    }

    public static void completarDatos(String name, String lastname, String codepostal) {
        waitPresence(CheckoutConstants.TITTLE_INFORMATION_XPATH);
        setInput(CheckoutConstants.INPUT_FIRST_NAME_XPATH, name);
        setInput(CheckoutConstants.INPUT_LAST_NAME_XPATH, lastname);
        setInput(CheckoutConstants.INPUT_CODE_POSTAL_XPATH, codepostal);
        click(CheckoutConstants.BUTTON_CONTINUE_CHECKOUT_XPATH);
    }

    public static void visualizarDetalleCompra() {
        waitVisibility(CheckoutConstants.TITLE_OVERVIEW_XPATH);
        Assert.assertTrue(isPresent(CheckoutConstants.TITLE_OVERVIEW_XPATH));
    }

    public static void validarResumenCompra() {
        Assert.assertTrue(isPresent(CheckoutConstants.PAYMENT_INFO_XPATH));
        Assert.assertTrue(isPresent(CheckoutConstants.SHIPPING_INFO_XPATH));
        Assert.assertTrue(isPresent(CheckoutConstants.TOTAL_LABEL_XPATH));
        Assert.assertTrue(isPresent(CheckoutConstants.TOTAL_PRICE_XPATH));
    }

    public static void finalizarCompra() {
        click(CheckoutConstants.BUTTON_FINISH_XPATH);
        waitVisibility(CheckoutConstants.TITLE_COMPLETE_XPATH);
        Assert.assertTrue(isPresent(CheckoutConstants.TITLE_COMPLETE_XPATH));
    }
}
