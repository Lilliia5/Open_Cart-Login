package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_POM {

    public Login_Page_POM() {

        PageFactory.initElements(BaseDriver.driver, this);

    }

    @FindBy(xpath = "//span[text()=\"My Account\"]")
    public WebElement myAccountDropDownMenu;

    @FindBy(css = "a[href*='/login']")
    public WebElement loginOptionOnDropDownMenu;

    @FindBy(css = "a[href*='/logout']")
    public WebElement logoutOptionOnDropDownMenu;

    @FindBy(id = "input-email")
    public WebElement emailField;
    @FindBy(id = "input-password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    public WebElement loginButton;

    @FindBy(css = "div[class*='alert-danger']")
    public WebElement alertDangerMessage;

    @FindBy(css = "a[href*='/register']")
    public WebElement registerOptionOnDropDownMenu;

    @FindBy(css = "div[id='content']>p>a")
    public WebElement loginPageLinkOnRegisterPage;
    @FindBy(css = "div[class='list-group']>a[href*='/login']")
    public WebElement loginOptionOnRighColumn;

    @FindBy(css = "div[class='list-group']>a[href*='/account']")
    public WebElement myAccountButtonOnRightColumn;

    @FindBy(css = "div[class=\"alert alert-danger alert-dismissible\"]")
    public WebElement alertMessage;

    @FindBy(xpath = "//a[text()=\"Logout\"]")
    public WebElement logoutButton;

    @FindBy(css = "a[href*=\"logout\"]")
    public  WebElement logoutButton2;


    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButtonOnNewCustomer;


}
