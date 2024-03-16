package step_definitions;

import hooks.Hooks;
import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.example.PageObject.CheckoutPage;
import org.example.PageObject.InventoryPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);



    @When("User remove item from shopping chart")
    public void userRemoveItem() {
        checkoutPage.ClickRemoveItem();
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() {
    checkoutPage.clickCheckoutButton();
    }

    @Then("User fill first name as {string}, last name as {string}, and postal code as {string}")
    public void userFillFirstNameAsLastNameAsAndPostalCodeAs(String awal, String akhir, Integer kode) {
    checkoutPage.fillFirstName(awal);
    checkoutPage.fillLastName(akhir);
    checkoutPage.fillPostalCode(kode);
    }

    @And("User Click Continue")
    public void userClickContinue() {
        checkoutPage.ClickContinueButton();
    }


}
