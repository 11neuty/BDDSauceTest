package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public static WebDriver webDriver;
   public boolean verifyLoginPage;

   public LoginPage(WebDriver driver){
       PageFactory.initElements(driver, this);
       webDriver = driver;
   }
   // SETUP LOCATOR
   @FindBy(xpath = "//input[@data-test='username']" )
   public static WebElement fieldUserName;
   @FindBy(xpath = "//input[@data-test='password']" )
   public static WebElement fieldPassword;

   @FindBy(xpath = "//input[@data-test='login-button']")
   public static WebElement buttonLogin;

   @FindBy(xpath = "//span[@class='title']")
   private WebElement labelProduct;



    // SETUP METHOD
   public void inputFieldUserName(String userName){
      fieldUserName.sendKeys(userName);
   }
   public void inputFieldPassword(String password){
      fieldPassword.sendKeys(password);
   }
   public void clickButtonLogin(){
       buttonLogin.click();
   }
    public static boolean verifyLoginPage(){
       boolean a = fieldUserName.isDisplayed();
       boolean b = fieldPassword.isDisplayed();
       boolean c = buttonLogin.isDisplayed();
       return  a && b && c;
   }
   public boolean verifyLabelProduct(){
      return labelProduct.isDisplayed();
   }



}
