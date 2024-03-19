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



    @When("User remove item {string} from shopping chart")
    public void userRemoveItemFromShoppingChart(String item) {
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() {
    checkoutPage.clickCheckoutButton();
    }

    @Then("User fill first name as {string}, last name as {string}, and postal code as {string}")
    public void userFillFirstNameAsLastNameAsAndPostalCodeAs(String awal, String akhir, String kode) {
    checkoutPage.fillFirstName(awal);
    checkoutPage.fillLastName(akhir);
    checkoutPage.fillPostalCode(kode);
    }

    @And("User Click Continue")
    public void userClickContinue() {
        checkoutPage.ClickContinueButton();
    }


    @Then("User see {string} as page overview")
    public void userRedirectToCheckoutOverviewAndSeeTotalPayment(String text) {
        Assert.assertEquals(text, checkoutPage.getPageOverview());
    }

    @When("User Click Finish")
    public void userClickFinish() {
        checkoutPage.ClickButtonFinish();

    }

    @Then("User redirect to Checkout complete page")
    public void userRedirectToCheckoutCompletePage() {
        checkoutPage.CheckoutcompletePage();
    }

    @Then("User redirect to Your Cart page")
    public void userRedirectToYourCartPage() {
        checkoutPage.verifyYourCartPage();
    }

    @Then("User redirect to Your Information page")
    public void userRedirectToYourInformationPage() {
        checkoutPage.verifyYourInformationPage();
    }
}
