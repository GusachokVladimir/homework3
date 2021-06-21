package tests.base.index;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.INDEX_PAGE_URL;

public class IndexPageTest extends BaseTest {
    @Test(groups = "alert")
    public void checkAlert(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.alert();
    }

    @Test(groups = "alert")
    public void prompt(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.prompt();
    }

    @Test(groups = "alert")
    public void confirm(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.confirm();
    }

    @Test(groups = "closePage")
    public void closeWindows(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.closePage();
    }

    @Test(groups = "closePage")
    public void closeCurrentWindows(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.closeCurrentPage();
    }
}
