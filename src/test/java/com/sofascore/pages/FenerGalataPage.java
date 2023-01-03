package com.sofascore.pages;

import com.sofascore.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FenerGalataPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//p[contains(text(),'Consent')]")
    public WebElement cookie;

    @FindBy(xpath = "//span[contains(text(),'Galatasaray')]")
    public WebElement clickGs;

//    @FindBy(xpath = "//span[contains(text(),'08/01/23')]")
//    public WebElement derbyDate;

    public void findDerbyDate(String date){
        Driver.get().findElement(By.xpath("//span[contains(text(),'"+date+"')]")).click();
    }

}
