package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_POM {

    public Login_Page_POM() {

        PageFactory.initElements(BaseDriver.driver, this);

    }

    @FindBy(css = "a[title='My Account']")
    public WebElement myAccountDropDownMenu;

    @FindBy(css = "a[href*='/login']")
    public WebElement loginButton;

    @FindBy(id = "input-email")
    public WebElement emailField;
    @FindBy(id = "input-password")
    public WebElement passwordField;


}
