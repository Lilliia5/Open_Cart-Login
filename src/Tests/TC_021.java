package Tests;
import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_021 extends BaseDriver {
    @Test
    public void TC_021(){
        WebElement myAccountDropdown = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]"));
        myAccountDropdown.click();
        wait_time(1);
        // Click on 'Login' option
        WebElement loginOption = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
        loginOption.click();
        wait_time(1);
        wait.until(ExpectedConditions.titleContains("Login"));
        // Validate Breadcrumb
        WebElement breadcrumb = driver.findElement(By.xpath("//ul[@class='breadcrumb']"));
        Assert.assertTrue(breadcrumb.isDisplayed(), "Breadcrumb is not displayed.");
        // Validate Page Heading
        WebElement pageHeading = driver.findElement(By.xpath("/html"));
        Assert.assertTrue(pageHeading.isDisplayed(), "Page Heading is not displayed.");
        // Validate Page Title
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Login"), "Page Title does not contain 'Login'.");
        // Validate Page URL
        String pageURL = driver.getCurrentUrl();
        Assert.assertTrue(pageURL.contains("route=account/login"), "Page URL does not contain 'route=account/login'.");
        wait_time(1);
    }
}
