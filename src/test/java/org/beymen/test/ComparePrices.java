package org.beymen.test;

import org.beymen.base.BaseTest;
import org.beymen.page.Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComparePrices extends BaseTest {
    Page page;
    @Before
    public void before(){
        page = new Page(getWebDriver());


    }
    @Test
    public void test(){
        page.typeText2().selectItem().createTxtFile().addToBasket().goToBasket().compareData();

    }
    @After
    public void after(){
        //teardown
    }
}
