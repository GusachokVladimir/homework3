package tests.base.pagination;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.PAGINATION_HOME_PAGE_URL;

public class PaginationHomePageTest extends BaseTest {

    @Test
    public void checkWaitStalenessOf(){
        basePage.goToUrl(PAGINATION_HOME_PAGE_URL);
        paginationHomePage.waitStalenessOf();
    }

    @Test
    public void checkWaitElementsIsVisible(){
        basePage.goToUrl(PAGINATION_HOME_PAGE_URL);
        paginationHomePage.waitElementsIsVisible();
    }

    @Test
    public void checkWaitElementToBeClickable(){
        basePage.goToUrl(PAGINATION_HOME_PAGE_URL);
        paginationHomePage.waitElementToBeClickable();
    }

    @Test
    public void checkWaitInvisibilityOf(){
        basePage.goToUrl(PAGINATION_HOME_PAGE_URL);
        paginationHomePage.waitInvisibilityOf();
    }

    @Test
    public void checkWaitToBeSelected(){
        basePage.goToUrl(PAGINATION_HOME_PAGE_URL);
        paginationHomePage.waitToBeSelected();
    }



}
