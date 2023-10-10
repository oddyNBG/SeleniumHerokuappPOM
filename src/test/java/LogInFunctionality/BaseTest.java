package LogInFunctionality;

import AddRemoveElements.AddRemoveElementsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;

    public HomePage homePage;
    public LoginPage loginPage;
    public SecureAreaPage secureAreaPage;
    public AddRemoveElementsPage addRemoveElementsPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage();
        loginPage = new LoginPage();
        secureAreaPage = new SecureAreaPage();
        addRemoveElementsPage = new AddRemoveElementsPage();

    }

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

}
