package com.crossFit.library.utilities.ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    private static JavascriptExecutor jsExecuter = (JavascriptExecutor) Driver.getDriver();

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element){
        jsExecuter.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void scroll(int from, int to){
        jsExecuter.executeScript("scroll("+ from + ", " + to + ");");
    }
}