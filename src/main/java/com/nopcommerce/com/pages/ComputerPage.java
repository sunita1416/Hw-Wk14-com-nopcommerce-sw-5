package com.nopcommerce.com.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.com.customlisteners.CustomListeners;
import com.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopOption;
    public void clickOnDesktopOption(){
        CustomListeners.test.log(Status.PASS, "clickOnDesktopOption " + desktopOption);
        Reporter.log("clickOnDesktopOption " + desktopOption.toString());
        clickOnElement(desktopOption);
    }
}
