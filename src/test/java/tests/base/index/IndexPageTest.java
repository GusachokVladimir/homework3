package tests.base.index;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.INDEX_PAGE_URL;

public class IndexPageTest extends BaseTest {
    @Test
    public void checkAlert(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.alert();
    }

    @Test
    public void prompt(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.prompt();
    }

    @Test
    public void confirm(){
        basePage.goToUrl(INDEX_PAGE_URL);
        indexPage.confirm();
    }
}
