package co.com.tcs.apipractica.tasks;

import co.com.tcs.apipractica.utils.Constants;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.tcs.apipractica.utils.Constants.USERS_API_ENDPOINT;

public class ConsumeApiGet implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(USERS_API_ENDPOINT).with(requestSpecification ->
                requestSpecification.param("id","2").log().all().
                        relaxedHTTPSValidation()));
        SerenityRest.lastResponse().prettyPrint();

    }

    public static ConsumeApiGet theUsers(){
        return Tasks.instrumented(ConsumeApiGet.class);
    }
}
