package org.beymen.constants;

import com.sun.jdi.Value;
import org.openqa.selenium.By;
import org.beymen.base.BasePage;
import org.openqa.selenium.support.ui.Select;


public class Constants {

    public static final By LOGO= By.xpath("//img[@alt='Beymen']");
    public static final By SEARCHTB = By.xpath("//input[@placeholder='Ürün, Marka Arayın']");
    public static final By FIRSTPRODUCT = By.xpath("//span[contains(.,'Mavi Çizgili Zincir Nakışlı Mini Gömlek Elbise')]");
    public static final By CART = By.xpath("//div[3]/button[2]");
    public static final By PRICE = By.id("priceNew");
    public static final By CARTPRICE = By.xpath("//span[contains(.,'879,00 TL')]");

    public static final By ADDPRODUCT = By.id("addBasket");
    public static final By SIZE40 = By.xpath("//span[contains(.,'40')]");
    public static final By DELETEPROD = By.id("removeCartItemBtn0-key-0");
    public static final By DROPDOWN = By.id("quantitySelect0-key-0");
    public static final By QUANTITY = DROPDOWN.cssSelector("#quantitySelect0-key-0 > option:nth-child(2)");
    public static final By EMPTYCART = By.xpath("//class[@value ='Sepetinizde Ürün Bulunmamaktadır]");
    public static final By SECONDPRICE =By.xpath("//class[@value = '1.758,00 TL']");
    public static final By SEARCH = By.xpath("//button[contains(.,'ARA')]");
    public static final By NOTIFY = By.id("notifyMessage");
    public static final By DELETENOTIFY = By.xpath("//p[contains(.,'Sepetinizden ürün başarılı bir şekilde silinmiştir.')]");


}
