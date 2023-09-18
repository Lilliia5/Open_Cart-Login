package OpenCart_Login;

import Utilities.BaseDriver;
import Utilities.Login_Page_POM;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class OC_10 extends BaseDriver {

    @Test
    void OC_10Test(){

        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();
        elements.emailField.sendKeys("pavanoltraining@gmail.com");
        elements.passwordField.sendKeys("12345");
        elements.loginButton.click();
        elements.myAccountDropDownMenu.click();
        elements.logoutOptionOnDropDownMenu.click();
        driver.navigate().back();

        List<WebElement> rightColumn = driver.findElements(By.cssSelector("div[class='list-group']"));
        for(WebElement element : rightColumn)
            element.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

    }

}
