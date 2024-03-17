package org.example.PageObject;

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
private WebElement CheckoutButton;

@FindBy(xpath = "//input[@id='first-name']")
private WebElement fieldfirstName;

@FindBy(xpath = "//input[@id='last-name']")
private WebElement fieldlastName;

@FindBy(xpath = "//input[@id='postal-code']")
private WebElement fieldpostalCode;

@FindBy(xpath = "//input[@id='continue']" )
private WebElement ContinueButton;

@FindBy(xpath = "//span[@class='title']")
private WebElement CheckoutoverviewSpan;

@FindBy(xpath = "//button[@id='finish']")
private WebElement ButtonFinish;

@FindBy(xpath = "//span[@class='title']")
private WebElement ThankyouSpan;


    //SETUP METHOD
 public void ClickRemoveItem(String item){
     String button = "//button[contains(@id,'remove')]/ancestor::div[2]/a/div[text()='"+item+"']";
     webDriver.findElement(By.xpath(button)).click();
    }
 public void clickCheckoutButton(){
     CheckoutButton.click();
 }
 public void fillFirstName(String awal){
     fieldfirstName.sendKeys(awal);
 }
 public void fillLastName(String akhir){
     fieldlastName.sendKeys(akhir);
 }
 public void fillPostalCode(String  kode){
     fieldpostalCode.sendKeys(kode);
 }

 public  void ClickContinueButton(){
     ContinueButton.click();
 }

 public void verifyPageOverview(){
     CheckoutoverviewSpan.isDisplayed();
 }
 public void ClickButtonFinish(){
     ButtonFinish.click();
 }

    public void CheckoutcompletePage(){
     ThankyouSpan.click();
    }
}
