package auto;

//import cucumber.api.CucumberOptions;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/admin"}
        , tags = "@View-History-And-Details or @ModifyUserAddress")
public class UserProfileManagementTestSuite {

}
