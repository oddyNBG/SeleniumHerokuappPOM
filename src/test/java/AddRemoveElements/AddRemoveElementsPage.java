package AddRemoveElements;

import LogInFunctionality.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AddRemoveElementsPage extends BaseTest {

    public AddRemoveElementsPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/button")
    public WebElement addElementButton;

    @FindBy(className = "added-manually")
    public WebElement deleteElementButton;

    @FindBy(className = "added-manually")
    public List<WebElement> deleteButtonList;


//    **************************************

    public void clickOnAddElementButton() {
        addElementButton.click();
    }

    public void clickOnAddElementButtonXtimes(int x) {
        for (int i = 0; i < x; i++) {
            addElementButton.click();
        }
    }

    public void clickOnDeleteButton() {
        deleteElementButton.click();
    }

    public void clickOnAllDeleteButtons() {
        for (int i = deleteButtonList.size(); i > 0 ; i--) {
            clickOnDeleteButton();
        }
    }

    public void tryCatchDeleteButton() {
        boolean delete = false;
        try {
            delete = deleteElementButton.isDisplayed();
        } catch (Exception e) {
            System.out.println("Delete button not found");
        }
        Assert.assertFalse(delete);
    }



}
