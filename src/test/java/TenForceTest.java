import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage;

import java.time.Duration;

public class TenForceTest {
    WebDriver driver;
    @BeforeClass
    public void setup(){
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTenForceNavigation(){
        driver.get("https://www.tenforce.com/");
        HomePage hm = new HomePage(driver);
        CareerPage cp = new CareerPage(driver);

        hm.goToCareerPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cp.goToLifeAtTenForce();
        cp.goToLifeAtTwoInterns();
        cp.scrollThroughArticle();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
