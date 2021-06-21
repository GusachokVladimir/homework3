package pages.base.index;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class IndexPage extends BasePage {
    public IndexPage(WebDriver driver){
        super(driver);
    }

    private final By element = By.id("a");
    private final By element2 = By.id("b");
    private final By element3 = By.id("c");

    WebDriverWait wait = new WebDriverWait(driver, 1000);

    public IndexPage alert(){
        driver.findElement(element).click();
        Alert alert = wait.until(alertIsPresent());
        alert.accept();
        return this;
    }

    public IndexPage prompt(){
        try {
            driver.findElement(element2).click();
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Super !!");
            prompt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert2.accept();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    public IndexPage confirm(){
        driver.findElement(element3).click();
        Alert alert3 = wait.until(alertIsPresent());
        alert3.dismiss();
        return this;
    }

}
