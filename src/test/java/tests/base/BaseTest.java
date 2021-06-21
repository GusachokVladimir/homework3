package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.base.index.IndexPage;
import pages.base.pagination.PaginationHomePage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);

    protected PaginationHomePage paginationHomePage = new PaginationHomePage(driver);
    protected IndexPage indexPage = new IndexPage(driver);

    @AfterClass
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite
    public void quite() {
        if (!HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
