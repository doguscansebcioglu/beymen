package org.beymen.page;

import org.apache.poi.sl.usermodel.Sheet;
import org.beymen.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.image.Kernel;
import java.security.Key;
import java.util.HashMap;

import static org.beymen.constants.Constants.*;


public class Page extends BasePage {

    public Page(WebDriver driver){
        super(driver);
    }

    public Page checkIfOpened(){
        ifExist(LOGO);
        return this;
    }
    public Page typeText1(){
        click(SEARCHTB);
        HashMap<String, String> words = getTextFromExcell();
        System.out.println(words.get("1"));
        sendKeys(SEARCHTB,words.get("1"));
        return this;
    }
    public Page deleteText(){
         sendKeys(SEARCHTB,Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
         return this;
    }
    public Page typeText2(){
        click(SEARCHTB);
        HashMap<String, String> words = getTextFromExcell();
        sendKeys(SEARCHTB,words.get("2"));
        click(SEARCH);
        return this;




    }
    public Page selectItem(){
        click(FIRSTPRODUCT);
        return this;
    }
    public Page createTxtFile(){
        String firstPrice = getText(PRICE);
        createDataFile();
        writeOnData(firstPrice);
        return this;
    }
    public Page addToBasket(){
        click(SIZE40);
        click(ADDPRODUCT);
        return this;
    }
    public Page compareData(){
        String comparedPrice = readFromData();
        String comparedPrice2 = getText(CARTPRICE);
        if (comparedPrice2.equals(comparedPrice) ){
            System.out.println("Matched");
        } else{
            System.out.println("MissedMatched");
        }


        return this;
    }
    public Page quantityChange(){
        click(DROPDOWN);
        click(QUANTITY);
        return this;
    }

    public Page search(){
        click(SEARCH);
        return this;
    }
    public Page goToBasket(){
        click(CART);
        return this;
    }
    public Page validateQuantity(){
        ifExist(NOTIFY);
        return this;
    }
    public Page deleteProduct(){
        click(DELETEPROD);
        ifExist(DELETENOTIFY);
        return this;
    }


}
