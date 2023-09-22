package Tests;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;



public class OL_06 extends BaseDriver {
    @Test
    public void OL_06(){

        WebElement myAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")));
        myAccount.click();
        wait_time(3);

        WebElement loginOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")));
        loginOption.click();
        wait_time(3);

        WebElement forgottenPasswordLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")));
        forgottenPasswordLink.click();
        wait_time(3);
    }
}
