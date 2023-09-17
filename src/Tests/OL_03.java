package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OL_03 extends BaseDriver {

    @Test
    @Parameters({"email","password","alertMessage"})
    public void OL03(String email, String password, String alertMessage){
        Login_Page_POM element = new Login_Page_POM();

        element.myAccountDropDownMenu.click();
        element.loginOptionOnDropDownMenu.click();
        element.emailField.sendKeys(email);
        element.passwordField.sendKeys(password);
        element.loginButton.click();

        String actualAlertMessage = element.alertMessage.getText();
        Assert.assertEquals(actualAlertMessage,alertMessage);


    }
}
