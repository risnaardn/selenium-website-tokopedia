package com.juaracoding.tokopedia.pageobject.pages;

import com.juaracoding.tokopedia.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tokopedia {
    private final WebDriver driver;

    public Tokopedia(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Cari di Tokopedia']")
    WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"zeus-root\"]/div/div[2]/div/div[2]/div[2]/span/div/span")
    WebElement getTxtJumlahProduk;



    //Page Object

    public void searchProduct(){
        searchInput.sendKeys("Televisi", Keys.RETURN);
        System.out.println("berhasil input");
    }

    public String getTxtJumlahProduk(){
        System.out.println("berhasil menampilkan jumlah produk tersedia");
        return getTxtJumlahProduk.getAttribute("Menampilkan 1 - 60 barang dari total 7.1jt+ untuk \"televisi\"");

    }

    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1700)");
        System.out.println("Berhasil scroll page");
    }
}

