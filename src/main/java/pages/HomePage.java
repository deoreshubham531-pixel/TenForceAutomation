package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static clickHelper.staleHandle.safeClick;

public class HomePage {
    WebDriver driver;
    By careerLink = By.xpath("//a[contains(text(),'Careers')]");



    @FindBy(css= "button.gdpr-agreement")
    WebElement iAgree;

    public HomePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void goToCareerPage(){
        iAgree.click();
        safeClick(driver,careerLink);
    }
}
