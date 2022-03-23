package auto.pages;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class AmazonBasePageObject extends PageObject {
    @Managed
    WebDriver driver;

    protected final Map<String, String> mapTable = new HashMap<>();


    public AmazonBasePageObject() {
        mapTable.clear();
    }

    // Get a single element on the page
    public WebElementFacade getElement(String gherkinElement) {

        String targetElement = mapTable.get(gherkinElement.toLowerCase());

        return $(targetElement).waitUntilVisible().and().waitUntilEnabled();
    }

}
