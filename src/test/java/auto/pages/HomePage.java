package auto.pages;

//import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import net.serenitybdd.core.pages.WebElementFacade;
//import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")


public class HomePage extends AmazonBasePageObject {
    public HomePage() {

        mapTable.clear();
        mapTable.put("Sign in".toLowerCase(), ".login");
        mapTable.put("Page Unique Element".toLowerCase(), ".login");
    }

}