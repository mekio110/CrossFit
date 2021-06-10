package com.crossFit.library.step_definitions.ui;

import com.crossFit.library.utilities.common.Environment;
import com.crossFit.library.utilities.ui.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

public class MainStepDefs extends BaseStep {

    @Given("user is on the Main page")
    public void user_is_on_the_Main_page() {
        String url = Environment.getProperty("url");
        Driver.getDriver().get(url);
        if (pages.mainPage().acceptCookies.isDisplayed()) {
            pages.mainPage().acceptCookies.click();
        }
        Assert.assertEquals(Driver.getDriver().getTitle(), pages.mainPage().title());
    }

    @Then("user should see Brand Menu elements")
    public void user_should_see_Brand_Menu_elements(List<String> brandMenuTexts) {
        for (int i = 0; i < brandMenuTexts.size(); i++){
            Assert.assertTrue(pages.mainPage().brandMenuElements.get(i).isDisplayed());
            Assert.assertTrue(pages.mainPage().brandMenuElements.get(i).isEnabled());
            expected = brandMenuTexts.get(i);
            actual = pages.mainPage().brandMenuElements.get(i).getText();
            Assert.assertEquals(expected, actual);
        }
    }

    @And("user should see {string} button")
    public void user_should_see_button(String buttonText) {
        Assert.assertTrue(pages.mainPage().loginButton.isDisplayed());
        Assert.assertTrue(pages.mainPage().loginButton.isEnabled());
        expected = buttonText;
        actual = pages.mainPage().loginButton.getText();
        Assert.assertEquals(expected, actual);
    }

    @Then("user should see Main Menu elements")
    public void user_should_see_Main_Menu_elements(List<String> mainMenuTexts) {
        for (int i = 0; i < mainMenuTexts.size(); i++){
            Assert.assertTrue(pages.mainPage().mainMenuElements.get(i).isDisplayed());
            Assert.assertTrue(pages.mainPage().mainMenuElements.get(i).isEnabled());
            expected = mainMenuTexts.get(i);
            actual = pages.mainPage().mainMenuElements.get(i).getText();
            Assert.assertEquals(expected, actual);
        }
    }

    @And("user should see date picker icon")
    public void user_should_see_date_picker_icon() {
        Assert.assertTrue(pages.mainPage().datePickerIcon.isDisplayed());
        Assert.assertTrue(pages.mainPage().datePickerIcon.isEnabled());
    }

    @And("user should see search icon")
    public void user_should_see_search_icon() {
        Assert.assertTrue(pages.mainPage().searchIcon.isDisplayed());
        Assert.assertTrue(pages.mainPage().searchIcon.isEnabled());
    }
}