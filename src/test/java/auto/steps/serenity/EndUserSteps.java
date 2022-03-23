package auto.steps.serenity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
//import org.jruby.RubyProcess.Sys;
import org.openqa.selenium.By;

import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;


import org.openqa.selenium.interactions.Actions;

import auto.pages.AmazonBasePageObject;
import auto.pages.HomePage;
import auto.util.TableOfAllPages;
//import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
@SuppressWarnings("serial")
public class EndUserSteps extends ScenarioSteps {

    String pageName;
    AmazonBasePageObject currentPage;

    // This table is used to store all the instance variables for pages under
    private static final Map<String, AmazonBasePageObject> allPagesUnderTest = new HashMap<>();

    // This table contains all pages of the app
    TableOfAllPages tableOfAllPages = new TableOfAllPages();

    public EndUserSteps() {
        super();
        this.pageName = null;
        this.currentPage = null;
    }

    @Step
    public void navigates_to_page(String gherkinPageName) throws Throwable {
        currentPage = getCurrentPage(gherkinPageName);
        currentPage.open();
    }

    @SuppressWarnings("unchecked")
    public AmazonBasePageObject getCurrentPage(String gherkinPageName) throws ClassNotFoundException {
        // if the desired page was not registered in the allPageUnderTest,
        // then add the desired page to the allPageUnderTest.
        this.pageName = gherkinPageName.toLowerCase();
        if (!allPagesUnderTest.containsKey(pageName)) {
            @SuppressWarnings("rawtypes")
            Class targetPageClass = (Class) tableOfAllPages.getClass(pageName);
            allPagesUnderTest.put(new String(pageName), (AmazonBasePageObject) getPages().get(targetPageClass));
        }
        // return the desired page to the caller
        return allPagesUnderTest.get(pageName);
    }

    @Step("User should be able to click on '{0}' element on the page")
    public void clicks_on_elementX(String gherkinElement) throws Throwable {
        // currentPage.getElement(gherkinElement).waitUntilVisible().and().waitUntilClickable().click();
        currentPage.getElement(gherkinElement).click();
    }

    @Step("User should land on the '{0}' page")
    public void lands_on_pageX(String gherkinPageName) throws Throwable {
        this.pageName = gherkinPageName.toLowerCase();
        currentPage = getCurrentPage(this.pageName);
        currentPage.getElement("page unique element");
 
    }

    @Step("User should see '{0}' at the '{1}' field")
    public void enters_inputX_into_the_elementY_input_field(String gherkinInputValue, String gherkinElement)
            throws Throwable {
        currentPage.getElement(gherkinElement).sendKeys(gherkinInputValue);
    }


    @Step("User should see '{1}' at the '{0}' field")
    public void verifies_that_the_value_of_the_field_is(String gherkinElement, String gherkinValue) throws Throwable {
        String actualValue = currentPage.getElement(gherkinElement).waitUntilVisible().getText();
    }

}
