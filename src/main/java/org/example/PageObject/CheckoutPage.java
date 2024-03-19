package org.example.PageObject;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        webDriver = driver;
    }
//LOCATOR
@FindBy(xpath = "//button[@id='checkout']")
private WebElement checkoutButton;

@FindBy(xpath = "//input[@id='first-name']")
private WebElement fieldFirstName;

@FindBy(xpath = "//input[@id='last-name']")
private WebElement fieldLastName;

@FindBy(xpath = "//input[@id='postal-code']")
private WebElement fieldPostalCode;

@FindBy(xpath = "//input[@id='continue']" )
private WebElement continueButton;

@FindBy(xpath = "//div[text()='Payment Information']")
private WebElement checkoutOverviewSpan;

@FindBy(xpath = "//button[@id='finish']")
private WebElement buttonFinish;

@FindBy(xpath = "//span[@class='title']")
private WebElement thankYouSpan;

@FindBy(xpath = "//span[@class='title']")
private WebElement yourCartPage;

@FindBy(xpath = "//span[@class='title']")
private WebElement yourInformationPage;


    //SETUP METHOD
 public void ClickRemoveItem(String item){
     String button = "//button[contains(@id,'remove')]/ancestor::div[2]/a/div[text()='"+item+"']";
     webDriver.findElement(By.xpath(button)).click();
    }
 public void clickCheckoutButton(){
     checkoutButton.click();
 }
 public void fillFirstName(String first){
     fieldFirstName.sendKeys(first);
 }
 public void fillLastName(String last){
     fieldLastName.sendKeys(last);
 }
 public void fillPostalCode(String  postalCode){
     fieldPostalCode.sendKeys(postalCode);
 }

 public  void ClickContinueButton(){
     continueButton.click();
 }

 public String getPageOverview(){
     return checkoutOverviewSpan.getText();

 }
 public void ClickButtonFinish(){
     buttonFinish.click();
 }

 public void CheckoutcompletePage(){
     thankYouSpan.click();
    }

 public void verifyYourCartPage(){
     yourCartPage.isDisplayed();
 }

 public void verifyYourInformationPage(){
     yourInformationPage.isDisplayed();
 }
}
