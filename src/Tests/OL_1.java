package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OL_1 extends BaseDriver {

    @Test
    @Parameters("alertText")
    void oL_1_Test(String alertText){
        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();
        elements.loginButton.click();
        Assert.assertEquals(elements.alertDangerMessage.getText(),alertText);



    }

}
