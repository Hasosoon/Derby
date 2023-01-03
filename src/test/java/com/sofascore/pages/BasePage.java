package com.sofascore.pages;

import com.sofascore.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
     BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
