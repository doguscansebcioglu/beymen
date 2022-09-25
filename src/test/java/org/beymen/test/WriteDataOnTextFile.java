package org.beymen.test;
import org.beymen.page.Page;
import org.beymen.base.BaseTest;



import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class WriteDataOnTextFile extends BaseTest {
    Page page;
    @Before
    public void before(){
        page = new Page(getWebDriver());
        page.typeText2(); //function change
        page.search();
        page.selectItem();
    }

    @Test
    public void test(){
        page.createTxtFile();

    }
    @After
    public void after(){
        //teardown
    }

}
