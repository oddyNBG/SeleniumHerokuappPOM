package LogInFunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = ".fa.fa-2x.fa-sign-in")
    public WebElement loginButton;

    @FindBy(id = "flash")
    public WebElement invalidUserMessage;

//    *************************************

    public void inputUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void inputPassword(String passwor) {
        passwordField.clear();
        passwordField.sendKeys(passwor);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
