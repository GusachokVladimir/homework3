package pages.base.index;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class IndexPage extends BasePage {
    public IndexPage(WebDriver driver) {
        super(driver);
    }

    private final By element = By.id("a");
    private final By element2 = By.id("b");
    private final By element3 = By.id("c");

    WebDriverWait wait = new WebDriverWait(driver, 1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public IndexPage alert() {
        driver.findElement(element).click();
        Alert alert = wait.until(alertIsPresent());
        alert.accept();
        return this;
    }

    public IndexPage prompt() {
        try {
            driver.findElement(element2).click();
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Super !!");
            prompt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert2.accept();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public IndexPage confirm() {
        driver.findElement(element3).click();
        Alert alert3 = wait.until(alertIsPresent());
        alert3.dismiss();
        return this;
    }

    public IndexPage closePage() {
        try {
            Thread.sleep(2000);
            js.executeScript("window.open()");
            closeWindow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public IndexPage closeCurrentPage() {
        try {
            Thread.sleep(2000);
            closeWindow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

}
