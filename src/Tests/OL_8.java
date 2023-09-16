package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OL_8 extends BaseDriver {

    @Test(priority = 1)
    void oL_9(){
        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.registerOptionOnDropDownMenu.click();
        elements.loginPageLinkOnRegisterPage.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

    }

    @Test(priority = 2)
    void oL_10(){
        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

    }

    @Test(priority = 3)
    void oL_11(){
        Login_Page_POM elements = new Login_Page_POM();
        elements.loginOptionOnRighColumn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

    }



}
