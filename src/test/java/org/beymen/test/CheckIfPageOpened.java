package org.beymen.test;
import org.beymen.base.BasePage;
import org.beymen.page.Page;
import org.beymen.base.BaseTest;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CheckIfPageOpened extends BaseTest {
    Page page;
    @Before
    public void before(){
        page = new Page(getWebDriver());


    }
    @Test
    public void test(){
        page.checkIfOpened();

    }
    @After
    public void after(){
        //teardown
    }
}
