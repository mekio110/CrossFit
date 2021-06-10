package com.crossFit.library.pages.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//nav[@aria-label='Brand menu']/ul/li/button")
    public List<WebElement> brandMenuElements;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//nav[@aria-label='Main menu']/ul/li/a")
    public List<WebElement> mainMenuElements;

    @FindBy(xpath = "//button[@aria-label='toggle date picker']")
    public WebElement datePickerIcon;

    @FindBy(id = "search-icon-button")
    public WebElement searchIcon;

    @FindBy(xpath = "//button[.='Accept']")
    public WebElement acceptCookies;

    @Override
    public String title() {
        return "CrossFit | Home";
    }
}