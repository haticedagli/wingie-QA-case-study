package com.enuygun.casestudy.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){}

    public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){

        if(webDriver.get() == null){
            WebDriverManager
                    .chromedriver()
                    .setup();
            webDriver.set(new ChromeDriver());
        }

        return webDriver.get();
    }

    public static void quitDriver(){

        if (webDriver.get()!= null){
            webDriver.get().quit();
            webDriver.remove();
        }
    }
}

