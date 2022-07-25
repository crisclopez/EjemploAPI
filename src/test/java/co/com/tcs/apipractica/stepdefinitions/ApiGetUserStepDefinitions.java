package co.com.tcs.apipractica.stepdefinitions;

import co.com.tcs.apipractica.questions.VerifyCode;
import co.com.tcs.apipractica.tasks.ConsumeApiGet;
import co.com.tcs.apipractica.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import static co.com.tcs.apipractica.utils.Constants.BASE_API_EDNPOINT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ApiGetUserStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        SerenityRest.useRelaxedHTTPSValidation();
    }

    @When("^the user consume the information$")
    public void theUserConsumeTheInformation() {
        OnStage.theActorCalled("User").whoCan(CallAnApi.at(BASE_API_EDNPOINT));
        theActorInTheSpotlight().attemptsTo(ConsumeApiGet.theUsers());

    }


    @Then("^the user will see the reponse (\\d+)$")
    public void theUserWillSeeTheReponse(int status) {
        theActorInTheSpotlight().should(seeThat(VerifyCode.statusResponse(), Matchers.equalTo(status)));
    }
}
