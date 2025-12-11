package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static clickHelper.staleHandle.waitForClickAndClick;
import static clickHelper.staleHandle.waitForVisibilityAndClick;

public class CareerPage {
    WebDriver driver;

    By lifeAtTenForceBtn = By.xpath("//nav[contains(@class,'tenforce')]//a[text()='Life at TenForce']");
    By lifeOfTwoInterns = By.xpath("//a[contains(@href,'life-of-two-interns')]");

    public CareerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goToLifeAtTenForce(){
        waitForVisibilityAndClick(driver,lifeAtTenForceBtn);
    }
    public void goToLifeAtTwoInterns(){
        waitForVisibilityAndClick(driver,lifeOfTwoInterns);
    }
    public void scrollThroughArticle() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

}
