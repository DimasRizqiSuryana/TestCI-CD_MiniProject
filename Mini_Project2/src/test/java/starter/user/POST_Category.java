package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_Category {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE

    @Step("I set POST category api endpoints")
    public String setPostCategoryApiEndpoints() {
        return url + "categories";
    }

    @Step("I send POST category HTTP request")
    public void sendPostCategoryHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Conten-Type", "aplication/json").body(requestBody.toJSONString()).post(setPostCategoryApiEndpoints());
    }

    @Step("I receive valid data for new category posts")
    public void validateDataNewCategoryPost() {
        restAssuredThat(response -> response.body("data.id", equalTo(13703)));
        restAssuredThat(response -> response.body("data.Description", equalTo("for gaming purposes")));
    }

    //NEGATIVE

    @Step("I set typo POST category api endpoints")
    public String setInvalidPostCategoryApiEndpoits() {
        return url + "categorie";
    }
}
