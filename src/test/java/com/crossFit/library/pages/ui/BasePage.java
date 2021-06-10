package com.crossFit.library.pages.ui;

import com.crossFit.library.utilities.ui.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * We can use to identify the title of the pages
     * @return title of the related page
     */
    public abstract String title();
}