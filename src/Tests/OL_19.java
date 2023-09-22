package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OL_19 extends BaseDriver {

    @Test
    void OC_19Test(){

        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();
        elements.continueButtonOnNewCustomer.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
}

