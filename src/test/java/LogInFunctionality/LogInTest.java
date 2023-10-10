package LogInFunctionality;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {


    @Test (priority = 10)
    public void ValidLoginTest() {
        homePage.clickOnFormAuthenticationButton();
        loginPage.inputUsername("tomsmith");
        loginPage.inputPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(secureAreaPage.successMessage.isDisplayed());
        Assert.assertTrue(secureAreaPage.logOutButton.isDisplayed());

    }

    @Test (priority = 20)
    public void InvalidLoginTest() {
        homePage.clickOnFormAuthenticationButton();
        loginPage.inputUsername("tom smith");
        loginPage.inputPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.invalidUserMessage.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

}
