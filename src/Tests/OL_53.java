package Tests;

import Pages.Login_Page_POM;
import Utilities.BaseDriver;
import net.bytebuddy.asm.Advice;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OL_53 extends BaseDriver {

    @Test
    @Parameters({"e-mail", "password"})
    void OL_53(String email, String password) throws IOException {
        Login_Page_POM elements = new Login_Page_POM();

        try {
            elements.myAccountDropDownMenu.click();
            elements.loginOptionOnDropDownMenu.click();
            BaseDriver.wait_time(3);
            elements.emailField.sendKeys(email);
            elements.passwordField.sendKeys(password);
            elements.loginButton.click();
            elements.myAccountDropDownMenu.click();

            Assert.assertFalse(elements.loginOptionOnDropDownMenu.isDisplayed());
        }catch (NoSuchElementException e){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");

            File screenshotInTemporaryFile  = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotInTemporaryFile, new File("screenShot/screenshot" + localDateTime.format(formatter) + "png"));







        }

    }
}
