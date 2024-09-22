package StepDef22;

import Base.BaseClass;
import Pom.Cart_Page;
import Pom.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_22 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    Cart_Page cartPage = new Cart_Page(driver);

    @When("User scrolls to bottom of page")
    public void userScrollsToBottomOfPage() {
        homePage.scrollsToBottomPage();
    }
    @Then("User verifies Recommended Items are visible")
    public void userVerifiesRecommendedItemsAreVisible() {
        Assert.assertTrue(homePage.visibleRecomItemTxt());
    }
    @When("User clicks on add to cart on Blue Top product on Recommended product")
    public void userClicksOnAddToCartOnBlueTopProductOnRecommendedProduct() throws InterruptedException {
        homePage.clickOnRecomAddToCart();
    }
    @When("User clicks on view cart button")
    public void userClicksOnViewCartButton() throws InterruptedException {
        homePage.clickOnViewCart();
    }
    @Then("User verifies that product Blue Top is displayed in cart page")
    public void userVerifiesThatProductBlueTopIsDisplayedInCartPage() {
        Assert.assertTrue(cartPage.visibleFirstProd());
    }
}
