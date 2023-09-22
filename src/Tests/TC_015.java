package Tests;
import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC_015 extends BaseDriver {
    @Test
    public void TC_015() {
        WebElement myAccountDropdown = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]"));
        myAccountDropdown.click();

        WebElement loginOption = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
        loginOption.click();

        WebElement passwordField = driver.findElement(By.id("input-password"));
        passwordField.sendKeys("YourPasswordHere");
        wait_time(3);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input"));
        loginButton.click();
        wait_time(3);

        WebElement passwordField1 = driver.findElement(By.id("input-password"));
        passwordField1.clear();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input-password"), ""));
        } catch (Exception e) {
            System.err.println("Timeout waiting for password field to become empty.");
        }

        String passwordFieldTypeAfterLogin = passwordField1.getAttribute("type");
        wait_time(3);

        Assert.assertEquals(passwordFieldTypeAfterLogin, "password");
        wait_time(2);

        String pageSourceAfterLogin = driver.getPageSource();

        wait_time(1);

        Assert.assertTrue(pageSourceAfterLogin.contains("YourPasswordHere"), "Password is still visible in the page source.");
        quitDriver();
    }
}
