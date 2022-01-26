package com.enuygun.casestudy.page_object_model;

import com.enuygun.casestudy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PaymentPage extends BaseModel{

    WebDriver driver;

    public PaymentPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public boolean isPaymentPanelExist(){
        List<WebElement> webElements = driver.findElements(By.id("payment-form"));
        return !webElements.isEmpty();
    }
}
