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

@FindBy(xpath = "//div[.='Sauce Labs Bike Light']/ancestor::div[1]/div[@class='item_pricebar']/button")
private WebElement RemoveSauceLabsBikeLight;

    //SETUP METHOD
 public void ClickRemoveItem(){
     RemoveSauceLabsBikeLight.click();
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
 public void fillPostalCode(Integer kode){
     fieldpostalCode.sendKeys(String.valueOf(kode));
 }

 public  void ClickContinueButton(){
     ContinueButton.click();
 }

}
