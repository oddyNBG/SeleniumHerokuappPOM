package AddRemoveElements;

import LogInFunctionality.BaseTest;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    @Test(priority = 10)
    public void AddAndRemoveOneElement() {
        homePage.clickOnAddRemoveElementsButton();
        Assert.assertTrue(addRemoveElementsPage.addElementButton.isDisplayed());
        addRemoveElementsPage.tryCatchDeleteButton();
        addRemoveElementsPage.clickOnAddElementButton();
        Assert.assertTrue(addRemoveElementsPage.deleteElementButton.isDisplayed());
        addRemoveElementsPage.clickOnDeleteButton();
        addRemoveElementsPage.tryCatchDeleteButton();
    }

    @Test(priority = 20)
    public void AddXElements () {
        homePage.clickOnAddRemoveElementsButton();
        Assert.assertTrue(addRemoveElementsPage.addElementButton.isDisplayed());
        addRemoveElementsPage.tryCatchDeleteButton();
        addRemoveElementsPage.clickOnAddElementButtonXtimes(3);
        Assert.assertEquals(addRemoveElementsPage.deleteButtonList.size(), 3);
    }

    @Test(priority = 30)
    public void DeleteAllElements() {
        homePage.clickOnAddRemoveElementsButton();
        Assert.assertTrue(addRemoveElementsPage.addElementButton.isDisplayed());
        addRemoveElementsPage.tryCatchDeleteButton();
        addRemoveElementsPage.clickOnAddElementButtonXtimes(5);
        Assert.assertEquals(addRemoveElementsPage.deleteButtonList.size(), 5);
        addRemoveElementsPage.clickOnAllDeleteButtons();
        addRemoveElementsPage.tryCatchDeleteButton();
    }

}
