package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_Product {

    protected static String url = "https://altashop-api.fly.dev/api/";

    ///POSITIVE

    @Step("I set GET api endpoints")
    public String setApiEndpoints() {
        return url + "products";
    }

    @Step("I send GET HTTP request")
    public void setGetHttpRequest() {
        SerenityRest.given().when().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }



    ///NEGATIVE

    @Step("I set typo GET api endpoints")
    public String setApiEndpoints2() {
        return url + "product";
    }

    @Step("I send typo GET HTTP request")
    public void sendGetHttpRequest2() {
        SerenityRest.given().when().get(setApiEndpoints2());
    }

    @Step("I receive invalid HTTP response code 404 Not Found")
    public void validateHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive nothing from the page")
    public void reciveNothing() {
        restAssuredThat(response -> response.noRootPath());
    }
}
