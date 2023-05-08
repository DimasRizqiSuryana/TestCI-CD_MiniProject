package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GET_Commant {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE

    @Step("I set GET commant api endpoints")
    public String setGetCommantApiEndpoints(){
        return url + "products/2/comments";
    }

    @Step("I send GET commant HTTP request")
    public void sendGetCommantHttpRequest() {
        SerenityRest.given().when().get(setGetCommantApiEndpoints());
    }

    //NEGATIVE

    @Step("I set typo GET commant api endpoints")
    public String setInvalidGetCommantApiEndpoints() {
        return url + "products/2/comment";
    }
}
