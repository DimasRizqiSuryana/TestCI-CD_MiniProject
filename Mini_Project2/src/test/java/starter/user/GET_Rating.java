package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_Rating {


    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE
    @Step("I set GET rating api endpoints")
    public String setGetRatingApiEndpoints() {
        return url + "products/1/ratings";
    }

    @Step("I send GET rating HTTP request")
    public void senGetRatingHttpRequest(){
        SerenityRest.given().when().get(setGetRatingApiEndpoints());
    }

    @Step("I receive valid data for all of the posts rating")
    public void validateDataGetRating() {
        restAssuredThat(response -> response.body("data", equalTo(2)));
    }

    //NEGATIVE

    @Step("I set typo GET rating api endpoints")
    public String setInvalidGetRatingEndpoints() {
        return url + "products/1/rating";
    }

    @Step("I send typo GET rating HTTP request")
    public void sendInvalidGetRatingHttpRequest() {
        SerenityRest.given().when().get(setInvalidGetRatingEndpoints());
    }
}
