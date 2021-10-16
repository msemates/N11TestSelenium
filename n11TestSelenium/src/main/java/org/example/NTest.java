package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTest{

    WebDriver driver;
    String url = "https://www.n11.com/";
    ProductModel productModel;
    BasketModel basketModel;

   // By logIn = By.xpath("//*[@title='Giriş Yap']");
    By giris = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]");
    By email = By.id("email");
    By password =By.id("password");
    By submit = By.id("loginButton");

    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SEMA\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        productModel = new ProductModel(driver);
        basketModel = new BasketModel(driver);

        driver.get(url);
        driver.manage().window().maximize();

    }

    public void loginInPage(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.n11.com/");
        try {

            Thread.sleep(4000);
            driver.findElement(giris).click();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void userInformation(){
        try {

            driver.findElement(email).sendKeys("mervesemaates@gmail.com");
            driver.findElement(password).sendKeys("Kbu2204.");
            Thread.sleep(4000);
            driver.findElement(submit).click();
            Thread.sleep(6000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }

    public void wordSearch(){
        productModel.wordSearch();
    }

    public void clickPage2(){
        productModel.clickPage2();
    }

    public void selectRandomProduct(){
        productModel.selectRandomProduct();
    }

    public void addToBasket(){ basketModel.addToBasket(); }

    public void clickToBasket(){
        basketModel.clickToBasket();
    }

    public void product(){
        basketModel.product();
    }

    public void deleteButton(){
        basketModel.deleteButton();
    }

    public void closes(){productModel.closes();}

  //  public void Popup() {basketModel.Popup();}
}
