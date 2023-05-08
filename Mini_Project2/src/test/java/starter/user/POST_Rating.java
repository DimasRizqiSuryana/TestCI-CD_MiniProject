package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class POST_Rating {

    ///POSITIVE

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST rating api endpoints")
    public String setPostRatingApiEndpoints() {
        return url + "products/13369/ratings";
    }

    @Step("I send POST rating HTTP request")
    public void sendPostRatingHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);

        SerenityRest.given().header("Conten-Type", "aplication/json").
                header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI")
                .body(requestBody.toJSONString()).post(setPostRatingApiEndpoints());
    }



    ///NEGATIVE

    @Step("I set typo POST rating api endpoints")
    public String setTypoPostRatingApiEndpoints() {
        return url + "products/2/rating";
    }


}
