package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.InventoryPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage  inventoryPage = new InventoryPage(driver);


    @When("User sort item by {string}")
    public void userSortItemBy(String SortByText) {
    inventoryPage.setSortProduct(SortByText);
    }

    @And("User add to cart button for {string}")
    public void userAddToCartItemFor(String item) {
        inventoryPage.ClickAddToCartItem(item);
    }

    @And("User click on shopping cart badge")
    public void userClickOnShoppingCartBadge() {
        inventoryPage.ClickShoppingCartBadge();
    }

    @Then("User already on CartPage")
    public void userOnCartPage() {Assert.assertTrue(inventoryPage.verifyCartPage());
    }

}
