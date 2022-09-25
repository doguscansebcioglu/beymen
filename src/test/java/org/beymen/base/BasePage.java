package org.beymen.base;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class BasePage {
    WebDriver driver = null;
    WebDriverWait wait = null;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    //find element
    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public boolean ifExist(By by) {
        return driver.findElement(by).isDisplayed();
    }

    //click event
    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    //input event
    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    //keyboard and mouse events
    public void hoverEl(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    //get text
    public String getText(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

    public HashMap<String, String>  getTextFromExcell() {
        HashMap<String, String> words = new HashMap<String, String>();
        words.put("1", "şort");
        words.put("2","gömlek");
        return words;

       /*
        try {
            File url = new File("C:\\Users\\dogus\\IdeaProjects\\selenium-automation\\src\\data\\beymenData.xlsx");
            FileInputStream fs = new FileInputStream(url);

            XSSFWorkbook workbook = new XSSFWorkbook(fs);

            XSSFSheet sheet = workbook.getSheet("Sheet1");


            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);


            words.put("1",cell.toString());


            Row row1 = sheet.getRow(1);
            Cell cell1 = row1.getCell(0);


            words.put("2",cell1.toString());

            return words;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
        */


    }



    public void createDataFile(){

            try {
                File myObj = new File("data.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

    }
    public void writeOnData(String data){
        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public String  readFromData(){
        try {
            Path fileName = Path.of("data.txt");

            // Now calling Files.readString() method to
            // read the file
            String str = Files.readString(fileName);

            // Printing the string
            System.out.println(str);
            return str;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

}
