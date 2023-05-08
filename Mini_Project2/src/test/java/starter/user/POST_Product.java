package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_Product {

    protected String url = "https://altashop-api.fly.dev/api/";

    ///POSITIVE

    @Step("I set POST api endpoints")
    public String setPostApiEndpoints() {
            return url + "products";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play with jess no limit");
        requestBody.put("price", 399);

        SerenityRest.given().header("Conten-Type", "aplication/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("I receive valid HTTP response code 201")
    public void reciveValidHttpResponse201() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new posts")
    public void validateDataNewUser() {
        restAssuredThat(response -> response.body("data.Name", equalTo("Sony PS5")));
        restAssuredThat(response -> response.body("data.Description", equalTo("play with jess no limit")));
        restAssuredThat(response -> response.body("data.Price", equalTo(399)));
    }

    ///NEGATIVE 

    @Step("I set typo POST api endpoints")
    public String setInvalidPostEndpoints() {
        return  url + "product";
    }

    @Step("I send typo POST HTTP request")
    public void sendInvalidPostHttpRequest(){
        SerenityRest.given().get(setInvalidPostEndpoints());
    }
}
