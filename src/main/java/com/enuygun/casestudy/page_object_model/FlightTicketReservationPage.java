package com.enuygun.casestudy.page_object_model;

import com.enuygun.casestudy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightTicketReservationPage extends BaseModel{

    WebDriver driver;

    @FindBy(id = "contact_email")
    private WebElement contactEmail;
    @FindBy(id = "contact_cellphone")
    private WebElement contactCellphone;
    @FindBy(id = "firstName_0")
    private WebElement name;
    @FindBy(id = "lastName_0")
    private WebElement surname;
    @FindBy(id = "birthDateDay_0")
    private WebElement birthdayDay;
    @FindBy(id = "birthDateMonth_0")
    private WebElement birthdayMonth;
    @FindBy(id = "birthDateYear_0")
    private WebElement birthdayYear;
    @FindBy(id = "publicId_0")
    private WebElement identificationId;
    @FindBy(id = "healthCode_0")
    private WebElement hesCode;
    @FindBy(id = "freeSupport")
    private WebElement freeSupport;
    @FindBy(xpath = "//*[@data-class='proceedCheckout']")
    private WebElement goToPayment;
    @FindBy(id = "gender_F_0")
    private WebElement femaleGender;

    public FlightTicketReservationPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void enterEmail(){
        sendKeysFunction(contactEmail, "haticeetoglu03@gmail.com");
    }

    public void enterCellphone(){
        sendKeysFunction(contactCellphone, "552 896 3875");
    }

    public void enterName(){
        sendKeysFunction(name, "Hatice");
    }

    public void enterSurname(){
        sendKeysFunction(surname, "Dağlı");
    }

    public void enterBirthday(){
        selectElementFromDropdown(birthdayDay, "27");
        selectElementFromDropdown(birthdayMonth, "Temmuz");
        selectElementFromDropdown(birthdayYear, "1999");
    }

    public void enterIdentificationId(){
        sendKeysFunction(identificationId, "10280300486");
    }

    public void enterHesCode(){
        sendKeysFunction(hesCode, "V7H4-9856-14");
    }

    public void clickFreeSupport(){
        clickFunction(freeSupport);
    }

    public void clickGoToPayment(){
        clickFunction(goToPayment);
    }

    public void clickFemaleGender(){
        clickFunction(femaleGender);
    }
}
