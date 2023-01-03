package com.sofascore.step_defs;

import com.sofascore.pages.FenerGalataPage;
import com.sofascore.utilities.BrowserUtils;
import com.sofascore.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class fenerGalataStepDefs {
    FenerGalataPage fenerGalataPage = new FenerGalataPage();
    @Given("User write search button {string}")
    public void user_write_search_button(String string) {
       // Alert alert = Driver.get().switchTo().alert();
        BrowserUtils.waitFor(2);
        fenerGalataPage.cookie.click();
        //alert.accept();
       fenerGalataPage.searchBox.sendKeys(string);
    }
    @When("User click on the team")
    public void user_click_on() {
        BrowserUtils.waitFor(1);
     fenerGalataPage.clickGs.click();
    }
    @When("User click on date which {string}")
    public void user_click_on_date_which(String string) {
        BrowserUtils.waitFor(5);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].click();",Driver.get().
                findElement(By.xpath("//span[contains(text(),'"+string+"')]")));
        fenerGalataPage.findDerbyDate(string);
        BrowserUtils.waitFor(5);

    }
    @Then("user should see {string} on the screen")
    public void user_should_see_on_the_screen(String string) {

    }
}
