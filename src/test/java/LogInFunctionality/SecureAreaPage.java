package LogInFunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage extends BaseTest{

    public SecureAreaPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "flash")
    public WebElement successMessage;

    @FindBy(css = ".button.secondary.radius")
    public WebElement logOutButton;


}
