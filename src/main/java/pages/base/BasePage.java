package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static constants.Constant.Urls.INDEX_PAGE_URL;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void closeWindow() {
        String window1 = driver.getWindowHandle();
        Set<String> currentWindows = driver.getWindowHandles();

        if (currentWindows.size() == 0){
            return;
        }

        String window2 = null;

        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        if (window2 != null) {
            driver.switchTo().window(window2);
            driver.close();
            driver.switchTo().window(window1);
        }
    }

    public WebElement waitElementsIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitStalenessOf(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.stalenessOf(element));
        return element;
    }

    public WebElement waitElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public WebElement waitInvisibilityOf(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.invisibilityOf(element));
        return element;
    }

    public WebElement waitToBeSelected(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.elementToBeSelected(element));
        return element;
    }


}
