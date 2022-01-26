package com.enuygun.casestudy.step_definition;

import com.enuygun.casestudy.page_object_model.FlightListingPage;
import com.enuygun.casestudy.page_object_model.FlightTicketReservationPage;
import com.enuygun.casestudy.page_object_model.PaymentPage;
import com.enuygun.casestudy.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.util.Assert;

public class FlightBookingSteps {

    FlightTicketReservationPage flightTicketReservationPage = new FlightTicketReservationPage();
    PaymentPage paymentPage = new PaymentPage();
    FlightListingPage flightListingPage = new FlightListingPage();

    @And("Enter email address")
    public void enterEmailAddress() {
        flightTicketReservationPage.enterEmail();
    }

    @And("Enter telephone number")
    public void enterTelephoneNumber() {
        flightTicketReservationPage.enterCellphone();
    }

    @And("Enter name")
    public void enterName() {
        flightTicketReservationPage.enterName();
    }

    @And("Enter surname")
    public void enterSurname() {
        flightTicketReservationPage.enterSurname();
    }

    @And("Enter birthday date")
    public void enterBirthdayDate() {
        flightTicketReservationPage.enterBirthday();
    }

    @And("Enter TC Identification number")
    public void enterTCIdentificationNumber() {
        flightTicketReservationPage.enterIdentificationId();
    }

    @And("Select gender")
    public void selectGender() {
        flightTicketReservationPage.clickFemaleGender();
    }

    @And("Enter hes code")
    public void enterHesCode() {
        flightTicketReservationPage.enterHesCode();
    }

    @And("Select support type")
    public void selectSupportType() {
        flightTicketReservationPage.clickFreeSupport();
    }

    @When("Click on go to payment button")
    public void clickOnGoToPaymentButton() {
        flightTicketReservationPage.clickGoToPayment();
    }

    @Then("Verify payment page is opened correctly")
    public void verifyPaymentPageIsOpenedCorrectly() throws InterruptedException {
        Thread.sleep(5000);
        Assert.isTrue(paymentPage.isPaymentPanelExist(), "Payment panel is not exist.");
    }

    @And("Select second ticket")
    public void selectSecondTicket() throws InterruptedException {
        Thread.sleep(3000);
        flightListingPage.clickSecondTicket();
    }

    @After
    public void driverQuit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.quitDriver();
    }
}
