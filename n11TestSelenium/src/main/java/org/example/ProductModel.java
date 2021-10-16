package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Random;


public class ProductModel {
    WebDriver driver;
    By searchWord = By.id("searchData");
    By next = By.linkText("2");
    By products= By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a/i");
    By close = By.xpath("//*[@class='tyj39b-5 lfsBU']");


    public ProductModel(WebDriver driver){

        this.driver = driver;
    }
    public void closes(){

        try{
            driver.findElement(close).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void wordSearch(){
        driver.findElement(searchWord).sendKeys("bilgisayar");
        driver.findElement(searchWord).sendKeys(Keys.ENTER);
    }

    public void clickPage2(){
        try {
            driver.findElement(next).click();
            Thread.sleep(5000);
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.n11.com/arama?q=bilgisayar&pg=2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    List<WebElement> result;
    public void selectRandomProduct(){
        try {
            result = driver.findElements(products);
            Thread.sleep(2000);
            Random r = new Random();
            int linkNo= r.nextInt(result.size());
            result.get(linkNo).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
