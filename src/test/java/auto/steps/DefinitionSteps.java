package auto.steps;

import java.util.List;

import auto.steps.serenity.EndUserSteps;
//import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps user;

    @Given("^user navigates to the Automation Practice \"([^\"]*)\" website$")
    public void navigates_to_page(String gherkinPageName) throws Throwable {
        user.navigates_to_page(gherkinPageName.toLowerCase());
    }

    @When("^user clicks on the \"([^\"]*)\" (?:button|radio button|check box)$")
    public void user_clicks_on_elementX(String gherkinElement) throws Throwable {
        user.clicks_on_elementX(gherkinElement);
    }

    @Then("^user lands on the \"([^\"]*)\" page$")
    public void user_lands_on_pageX(String gherkinPageName) throws Throwable {
        user.lands_on_pageX(gherkinPageName.toLowerCase());
    }

    @When("^user enters \"([^\"]*)\" into the \"([^\"]*)\" input field$")
    public void user_enters_inputX_into_the_elementY_input_field(String inputValue, String gherkinElement)
            throws Throwable {
        user.enters_inputX_into_the_elementY_input_field(inputValue, gherkinElement);
    }

    @Then("^user verifies that the value of the \"([^\"]*)\" field is \"([^\"]*)\"$")
    public void user_verifies_that_the_value_of_the_field_is(String gherkinElement, String gherkinValue)
            throws Throwable {
        user.verifies_that_the_value_of_the_field_is(gherkinElement, gherkinValue);
    }

}