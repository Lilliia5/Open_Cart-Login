package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OL_09 extends BaseDriver {

    @Test
    @Parameters({"email","password"})
    public void OL09(String email, String password){
        Login_Page_POM element = new Login_Page_POM();

        element.myAccountDropDownMenu.click();
        element.loginOptionOnDropDownMenu.click();
        element.emailField.sendKeys(email);
        element.passwordField.sendKeys(password);
        element.loginButton.click();
        String actualPageTitle  = driver.getTitle();
        wait_time(2);
        driver.navigate().back();
        String backPageTitle  =  driver.getTitle();
        Assert.assertEquals(actualPageTitle,backPageTitle);



    }
}
