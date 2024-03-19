package org.example.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver webDriver;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    //SETUP LOCATOR
    @FindBy(xpath ="//select[@class='product_sort_container']")
        private WebElement sortProduct;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
        private WebElement shoppingCartBadge;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement cartPage;




    //SETUP METHOD
    public void setSortProduct(String SortByText){
        Select select = new Select(sortProduct);
        select.selectByVisibleText(SortByText);
    }
    public void clickAddToCartItem(String item){
    String button = "//div[text()='"+ item +"']//ancestor::div[@id='inventory_container']//button[text()='Add to cart']";
    webDriver.findElement(By.xpath(button)).click();
    }

    public void clickShoppingCartBadge(){
        shoppingCartBadge.click();
    }

    public boolean verifyCartPage(){
        return cartPage.isDisplayed();
    }
}
