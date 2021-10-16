package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketModel {
    WebDriver driver;

    By addBasket= By.xpath("[//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]]");
    By clickBasket= By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a/i");
    By increment = By.xpath("//*[@value='2']");
    By delete = By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section[2]/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]");
  //  By popup =By.xpath("//*[@class='wis-clsbtn-99131']");
    public BasketModel(WebDriver driver){

        this.driver = driver;
    }
   /* public void Popup(){
        try{
            driver.findElement(popup).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

*/
    }


    public void clickToBasket(){
        try {
            driver.findElement(clickBasket).click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void product(){
        try {
            driver.findElement(increment).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void deleteButton(){
        try {
            driver.findElement(delete).click();
            Thread.sleep(5000);
            Assert.assertNotNull(delete);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
