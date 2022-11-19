package com.juaracoding.tokopedia.pageobject;


import com.juaracoding.tokopedia.pageobject.drivers.DriverSingleton;
import com.juaracoding.tokopedia.pageobject.pages.Tokopedia;
import com.juaracoding.tokopedia.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;


public class RunnerTest {


    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);


        Tokopedia tokopedia = new Tokopedia();
        tokopedia.searchProduct();
        tokopedia.getTxtJumlahProduk();
        tokopedia.scrollPage();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}