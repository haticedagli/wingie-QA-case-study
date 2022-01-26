package com.enuygun.casestudy.step_definition;

import com.enuygun.casestudy.page_object_model.FlightListingPage;
import com.enuygun.casestudy.page_object_model.FlightTicketPage;
import com.enuygun.casestudy.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;

import java.util.concurrent.TimeUnit;

public class SearchFlightsSteps {

    WebDriver driver;
    FlightTicketPage flightTicketPage = new FlightTicketPage();
    FlightListingPage flightListingPage = new FlightListingPage();

    @Given("Go to Enuygun Flight Ticket Selection Page")
    public void goToEnuygunFlightTicketSelectionPage() throws InterruptedException {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.enuygun.com/ucak-bileti");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @Given("Choose from which point to board the plane")
    public void chooseFromWhichPointToBoardThePlane() {
        flightTicketPage.clickDepartureFlightPoint();
        flightTicketPage.clickFirstPopularCity();
    }

    @Given("Choose where to go")
    public void chooseWhereToGo() {
        flightTicketPage.clickDestinationFlightPoint();
        flightTicketPage.clickFirstPopularCity();
    }

    @Given("Select departure date")
    public void selectDepartureDate(){
        flightTicketPage.clickDestinationDate();
        flightTicketPage.pickDepartureDateValue();
    }

    @When("Click on find cheap tickets")
    public void clickOnFindCheapTickets() {
        flightTicketPage.clickOnFindTicket();
    }

    @Then("Verify page listing one-way flight tickets")
    public void verifyPageListingOneWayFlightTickets() throws InterruptedException {
        Thread.sleep(3000);
        Assert.isTrue(flightListingPage.isSearchResultDepartureOnlyExist(), "Search results not listed.");
    }

    @And("Select return date")
    public void selectReturnDate() {
        flightTicketPage.clickReturnDate();
        flightTicketPage.pickReturnDateValue();
    }

    @When("Select first ticket")
    public void selectFirstTicket() throws InterruptedException {
        flightListingPage.clickFirstTicket();
        Thread.sleep(2000);
    }

    @Then("Verify page listing return flight tickets")
    public void verifyPageListingReturnFlightTickets() {
        Assert.isTrue(flightListingPage.isSearchResultReturnExist(),"Return flights cannot be listed.");
    }

    @After
    public void driverQuit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.quitDriver();
    }
}
