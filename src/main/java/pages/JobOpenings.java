package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static clickHelper.staleHandle.safeClick;
import static clickHelper.staleHandle.safeGetText;

public class JobOpenings {

    WebDriver driver;

    By careerLink = By.xpath("//a[contains(text(),'Careers')]");
    By cvText = By.xpath("//span[text()='Feel free to send your CV to']");

    public JobOpenings(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToCareerPage() {
        safeClick(driver, careerLink);
    }

    // ✅ Correct method to get CV text
    public String getCvText() {
        return safeGetText(driver, cvText);
    }
}
