package org.beymen.base;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {

    static WebDriver webDriver=null;

    //properties before starting browser
    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\dogus\\IdeaProjects\\selenium-automation\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.beymen.com/");
    }
    //get-set
    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;

    }
    //teardown
    public void tearDown(){
        getWebDriver().quit();
    }


}
