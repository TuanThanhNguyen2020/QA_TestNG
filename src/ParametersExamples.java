import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExamples {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setUp(String browser, String app){
        if ()
        System.setProperty("webdriver.gecko.driver","C:/Drivers/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not display on the page");
    }

    @Test(priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM","Title is not matched");
    }

//    @AfterClass
//    void tearDown(){
//        driver.quit();
//    }
}
