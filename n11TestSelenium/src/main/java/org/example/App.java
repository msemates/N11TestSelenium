package org.example;


public class App
{
    public static void main( String[] args )
    {
        NTest nTest;
        nTest = new NTest();
        nTest.setup();
        nTest.loginInPage();
        nTest.userInformation();
        nTest.closes();
        nTest.wordSearch();
        nTest.clickPage2();
        nTest.selectRandomProduct();
        nTest.addToBasket();
        nTest.clickToBasket();
        nTest.product();
        nTest.deleteButton();

    }
}