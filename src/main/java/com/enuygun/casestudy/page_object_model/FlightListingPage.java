package com.enuygun.casestudy.page_object_model;

import com.enuygun.casestudy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightListingPage extends BaseModel{

    WebDriver driver;

    @FindBy(className = "flight-list-return")
    private WebElement flightListReturn;

    public FlightListingPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public boolean isSearchResultDepartureOnlyExist(){
        List<WebElement> webElements = driver.findElements(By.className("search-result-departure-only"));
        return !webElements.isEmpty();
    }

    public void clickFirstTicket(){
        List<WebElement> webElements = driver.findElements(By.className("action-select-btn"));
        clickFunction(webElements.stream().findFirst().orElse(null));
    }

    public void clickSecondTicket(){
        List<WebElement> webElements = flightListReturn.findElements(By.className("action-select-btn"));
        clickFunction(webElements.stream().findFirst().orElse(null));
    }

    public boolean isSearchResultReturnExist(){
        List<WebElement> webElements = driver.findElements(By.className("flight-list-return"));
        return !webElements.isEmpty();
    }

}
