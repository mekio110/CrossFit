package com.crossFit.library.step_definitions.ui;

import com.crossFit.library.utilities.ui.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class LoginStepDefs extends BaseStep {

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String buttonText) {
        pages.mainPage().loginButton.click();
        Assert.assertEquals(buttonText, pages.mainPage().loginButton.getText());
    }

    @Then("user should see Login screen")
    public void user_should_see_Login_screen() {
        wait.until(ExpectedConditions.visibilityOf(pages.loginPage().loginHeader));
        Assert.assertTrue(pages.loginPage().loginHeader.isDisplayed());
        Assert.assertEquals(Driver.getDriver().getTitle(), pages.loginPage().title());
    }

    @Then("User should see Login screen elements")
    public void user_should_see_Login_screen_elements(List<String> loginElements) {
        // header
        pages.loginPage().loginHeader.isDisplayed();
        expected = loginElements.get(0);
        actual = pages.loginPage().loginHeader.getText();
        Assert.assertEquals(expected, actual);

        // description
        pages.loginPage().loginDescription.isDisplayed();
        expected = loginElements.get(1);
        actual = pages.loginPage().loginDescription.getText();
        Assert.assertEquals(expected, actual);

        // email input
        pages.loginPage().emailInput.isDisplayed();
        expected = loginElements.get(2);
        actual = pages.loginPage().emailInput.getAttribute("placeholder");
        Assert.assertEquals(expected, actual);

        // password input
        pages.loginPage().passwordInput.isDisplayed();
        expected = loginElements.get(3);
        actual = pages.loginPage().passwordInput.getAttribute("placeholder");
        Assert.assertEquals(expected, actual);

        // login button
        pages.loginPage().loginButton.isDisplayed();
        pages.loginPage().loginButton.isEnabled();
        expected = loginElements.get(4);
        actual = pages.loginPage().loginButton.getAttribute("value");
        Assert.assertEquals(expected, actual);

        // create an account hyperlink
        pages.loginPage().createAnAccount.isDisplayed();
        pages.loginPage().createAnAccount.isEnabled();
        expected = loginElements.get(5);
        actual = pages.loginPage().createAnAccount.getText();
        Assert.assertEquals(expected, actual);

        // forgot password hyperlink
        pages.loginPage().forgotPassword.isDisplayed();
        pages.loginPage().forgotPassword.isEnabled();
        expected = loginElements.get(6);
        actual = pages.loginPage().forgotPassword.getText();
        Assert.assertEquals(expected, actual);
    }
}