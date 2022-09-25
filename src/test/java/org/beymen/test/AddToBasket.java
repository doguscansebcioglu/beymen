package org.beymen.test;

import org.beymen.base.BaseTest;
import org.beymen.page.Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddToBasket extends BaseTest {
    Page page;
    @Before
    public void before(){
        page = new Page(getWebDriver());


    }
    @Test
    public void test(){
        page.typeText2().selectItem().addToBasket();

    }
    @After
    public void after(){
        //teardown
    }
}
