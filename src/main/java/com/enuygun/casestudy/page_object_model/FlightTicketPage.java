package com.enuygun.casestudy.page_object_model;

import com.enuygun.casestudy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightTicketPage extends BaseModel{

    WebDriver driver;

    @FindBy(id = "OriginInput")
    private WebElement departureFlightPoint;
    @FindBy(id = "react-autowhatever-1-section-1-item-0")
    private WebElement firstPopularCity;
    @FindBy(id = "DestinationInput")
    private WebElement destinationFlightPoint;
    @FindBy(id = "DepartureDate")
    private WebElement departureDate;
    @FindBy(xpath = "//*[@aria-label='Çarşamba, 16 Şubat 2022']")
    private WebElement departureDateValue;
    @FindBy(className = "primary-btn")
    private WebElement search;
    @FindBy(id = "ReturnDate")
    private WebElement returnDate;
    @FindBy(xpath = "//*[@aria-label='Cuma, 18 Şubat 2022']")
    private WebElement returnDateValue;

    public FlightTicketPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void clickDepartureFlightPoint() {
        clickFunction(departureFlightPoint);
    }
    public void clickFirstPopularCity(){
        clickFunction(firstPopularCity);
    }
    public void clickDestinationFlightPoint(){
        clickFunction(destinationFlightPoint);
    }
    public void clickDestinationDate(){
        clickFunction(departureDate);
    }
    public void pickDepartureDateValue(){
        clickFunction(departureDateValue);
    }
    public void clickOnFindTicket(){
        clickFunction(search);
    }
    public void clickReturnDate(){
        clickFunction(returnDate);
    }
    public void pickReturnDateValue(){
        clickFunction(returnDateValue);
    }

}
