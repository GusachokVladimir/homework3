package pages.base.pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

import java.util.List;

public class PaginationHomePage extends BasePage {
    public PaginationHomePage(WebDriver driver) {
        super(driver);
    }

    private final By buttonPaginationLocator = By.xpath("//div[text()='Pagination.js']");
    private final By numberLocator = By.xpath("//div[@class='data-container']/ul/li");
    private final By pagesLocator = By.xpath("//div[@class='paginationjs-pages']/ul/li");
    private final By checkboxLocator = By.id("checkbox-beforeInit");

    List<WebElement> elements;
    List<WebElement> pages;

    public PaginationHomePage waitStalenessOf() {
        elements = driver.findElements(numberLocator);
        pages = driver.findElements(pagesLocator);
        String text = elements.get(5).getText();
        System.out.println(text);

        pages.get(2).click();
        waitStalenessOf(elements.get(5));

        elements = driver.findElements(numberLocator);
        text = elements.get(5).getText();
        System.out.println(text);
        return this;
    }

    public PaginationHomePage waitElementsIsVisible() {
        WebElement element = driver.findElement(buttonPaginationLocator);
        waitElementsIsVisible(element);
        return this;
    }

    public PaginationHomePage waitElementToBeClickable() {
        WebElement element = driver.findElement(buttonPaginationLocator);
        waitElementToBeClickable(element);
        return this;
    }

    public PaginationHomePage waitInvisibilityOf() {
        WebElement element = driver.findElement(buttonPaginationLocator);
        waitInvisibilityOf(element);
        return this;
    }

    public PaginationHomePage waitToBeSelected() {
        WebElement element = driver.findElement(checkboxLocator);
        waitToBeSelected(element);
        return this;
    }


}
