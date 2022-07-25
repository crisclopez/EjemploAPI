package co.com.tcs.apipractica.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyCode implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }

    public static VerifyCode statusResponse(){
        return new VerifyCode();
    }
}
