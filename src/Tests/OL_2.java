package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.time.Duration;


public class OL_2 extends BaseDriver {

    @Test(priority = 1)
    @Parameters("text")
    void oL_6(String text) throws InterruptedException  {
        Login_Page_POM elements = new Login_Page_POM();
        elements.myAccountDropDownMenu.click();
        elements.loginOptionOnDropDownMenu.click();
        elements.passwordField.sendKeys(text);
        Thread.sleep(Duration.ofSeconds(3));
        Actions actions = new Actions(driver);
        actions.moveToElement(elements.passwordField)
                .contextClick(elements.passwordField)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        Thread.sleep(Duration.ofSeconds(3));



        actions.moveToElement(elements.emailField).click(elements.emailField).perform();
        actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
        Assert.assertNotEquals(elements.emailField.getAttribute("value"),text);



    }

    @Test(priority = 2)
    @Parameters("text")
    void oL_13(String text) throws InterruptedException {
        Login_Page_POM elements = new Login_Page_POM();
        elements.passwordField.clear();
        elements.emailField.clear();

        Thread.sleep(Duration.ofSeconds(2));
        Actions actions = new Actions(driver);
        elements.passwordField.sendKeys(text);

        actions.click(elements.passwordField).keyDown(Keys.COMMAND)
                .sendKeys("c").perform();

        Thread.sleep(Duration.ofSeconds(2));

        actions.moveToElement(elements.emailField).click(elements.emailField).perform();
        actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
        Assert.assertNotEquals(elements.emailField.getAttribute("value"),text);


    }
}
