package com.crossFit.library.pages.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//h1[.='Log In']")
    public WebElement loginHeader;

    @FindBy(xpath = "//p[.='Please log in with your existing CrossFit ID (from the Open, Judges Course, or a seminar registration). If you are new, create an account.']")
    public WebElement loginDescription;

    @FindBy(id = "email-login")
    public WebElement emailInput;

    @FindBy(id = "password-login")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[.='Create an account']")
    public WebElement createAnAccount;

    @FindBy(xpath = "//a[.='Forgot password']")
    public WebElement forgotPassword;

    @Override
    public String title() {
        return "CrossFit | Home";
    }
}