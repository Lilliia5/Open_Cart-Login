package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OL_46 extends BaseDriver {

    @Test
    void OL_46() {
        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();

        Assert.assertEquals(elements.emailField.getAttribute("placeholder"), "E-Mail Address");
        Assert.assertEquals(elements.passwordField.getAttribute("placeholder"), "Password");






    }



}
