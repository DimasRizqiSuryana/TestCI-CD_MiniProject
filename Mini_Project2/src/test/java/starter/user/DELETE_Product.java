package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_Product {

    protected String url = "https://altashop-api.fly.dev/api/";

    ///POSITIVE

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoints() {
        return url + "products/1";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }

    ///NEGATIVE

    @Step("I set DELETE to invalid api endpoints")
        public String setDeleteInvalidApiEndpoint() {
        return url + "products";
    }

    @Step("I send DELETE Invalid HTTP request")
    public void sendInvalidDeleteHttpRequest() {
        SerenityRest.given().delete(setDeleteInvalidApiEndpoint());
    }

    @Step("I receive invalid HTTP response code 405 Not Found")
    public void validateHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }

}
