package LogInFunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest{

        public HomePage() {
            PageFactory.initElements(driver, this);
        }

        @FindBy(linkText = "Form Authentication")
        public WebElement formAuthenticationButton;

        @FindBy (linkText = "Add/Remove Elements")
        public WebElement addRemoveElementsButton;

//        ******************************************

    public void clickOnFormAuthenticationButton() {
        formAuthenticationButton.click();
    }

    public void clickOnAddRemoveElementsButton() {
        addRemoveElementsButton.click();
    }


}
