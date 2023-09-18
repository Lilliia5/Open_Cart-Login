package OpenCart_Login;

import Utilities.BaseDriver;
import Utilities.Login_Page_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OC_04 extends BaseDriver {

    @Test
    @Parameters("warningMessage")
    void OL_4Test(@Optional String message) {

        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();
        elements.emailField.sendKeys("pavanoltraining@gmail.com");
        elements.passwordField.sendKeys("xyzabc123");
        elements.loginButton.click();
        Assert.assertEquals(elements.alertDangerMessage.getText(),message);


    }
}