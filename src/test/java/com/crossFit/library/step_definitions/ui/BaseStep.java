package com.crossFit.library.step_definitions.ui;

import com.crossFit.library.utilities.ui.Driver;
import com.crossFit.library.utilities.ui.Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseStep {
    protected String expected;
    protected String actual;
    protected Pages pages = new Pages();
    protected WebDriverWait wait = new WebDriverWait (Driver.getDriver(), 5);
    protected Actions actions = new Actions(Driver.getDriver());
    protected JavascriptExecutor jsExecuter = (JavascriptExecutor) Driver.getDriver();
}
