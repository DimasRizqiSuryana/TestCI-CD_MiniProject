package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class POST_Commant {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITTIVE

    @Step("I set POST commant api endpoints")
    public String setPostCommantHttpRequest() {
        return url + "products/13369/comments";
    }

    @Step("I send POST commant HTTP request")
    public void sendPostCommantHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Conten-Type", "aplication/json").
                header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI")
                .body(requestBody.toJSONString()).post(setPostCommantHttpRequest());
    }

    //NEGATIVE

    @Step("I set typo POST commant api endpoints")
    public String setInvalidPostCommantEndpoints() {
        return url + "products/13369/comment";
    }
}
