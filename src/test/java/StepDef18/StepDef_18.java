package StepDef18;

import Base.BaseClass;
import Pom.CategoryProd_Page;
import Pom.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_18 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    CategoryProd_Page categoryProdPage = new CategoryProd_Page(driver);

    @When("User verifies that categories are visible on left side bar")
    public void userVerifiesThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertTrue(homePage.visibleCategoryList());
    }
    @When("User clicks on women category")
    public void userClicksOnWomenCategory() {
        homePage.clickOnWomenCategory();
    }
    @When("User clicks on any category link under Women category")
    public void userClicksOnAnyCategoryLinkUnderWomenCategory() {
        homePage.clickOnWomenTops();
    }
    @When("User verifies that category page is displayed and confirm text {string}")
    public void userVerifiesThatCategoryPageIsDisplayedAndConfirmText(String prTitle) {
        Assert.assertTrue(categoryProdPage.visibleWomenProdTitle(prTitle));
    }
    @When("On left side bar user click on any sub-category link of men category")
    public void onLeftSideBarUserClickOnAnySubCategoryLinkOfMenCategory() {
        categoryProdPage.clickOnMenSubCategory();
    }
    @Then("User verifies that category page url contains text {string}")
    public void userVerifiesThatCategoryPageUrlContainsText(String urlContains) {
        Assert.assertTrue(categoryProdPage.verifyProdCategoryPage(urlContains));
    }
}
