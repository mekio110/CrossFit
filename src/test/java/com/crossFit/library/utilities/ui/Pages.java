package com.crossFit.library.utilities.ui;

import com.crossFit.library.pages.ui.LoginPage;
import com.crossFit.library.pages.ui.MainPage;

public class Pages {
    private MainPage mainPage;
    private LoginPage loginPage;

    public Pages() {
        this.mainPage = new MainPage();
        this.loginPage = new LoginPage();
    }

    public MainPage mainPage() {
        return mainPage;
    }

    public LoginPage loginPage() {
        return loginPage;
    }
}