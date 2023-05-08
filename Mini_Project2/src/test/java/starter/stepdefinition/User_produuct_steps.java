package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DELETE_Product;
import starter.user.GET_Product;
import starter.user.POST_Product;

public class User_produuct_steps {

    @Steps
    GET_Product getProduct;

    @Steps
    POST_Product postProduct;

    @Steps
    DELETE_Product deleteProduct;

    // GET //POSITIVE

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        getProduct.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        getProduct.setGetHttpRequest();
    }

    @And("I receive valid HTTP response code 200")
    public void reciveValidHttpResponse() {
        getProduct.validateHttpResponse200();
    }



    // GET ///NEGATIVE

    @Given("I set typo GET api endpoints")
    public void setTypoGetHttpEndpoints() {
        getProduct.setApiEndpoints2();
    }

    @When("I send typo GET HTTP request")
    public void sendTypoGetHttpRequest() {
        getProduct.sendGetHttpRequest2();
    }

    @And("I receive invalid HTTP response code 404 Not Found")
    public void reciveInvalidHttpResponse() {
        getProduct.validateHttpResponseCode404();
    }

    @Then("I receive nothing from the page")
    public void reciveNothing() {
        getProduct.reciveNothing();
    }

    // POST ///POSITIVE

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        postProduct.setPostApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        postProduct.sendPostHttpRequest();
    }

    @And("I receive valid HTTP response code 201")
    public void reciveValidHttp201() {
        postProduct.reciveValidHttpResponse201();
    }

    @Then("I receive valid data for new posts")
    public void reciveValidDataNewUser() {
        postProduct.validateDataNewUser();
    }

    // POST ///NEGATIVE

    @Given("I set typo POST api endpoints")
    public void setTypoPostApiEndpoints() {
        postProduct.setInvalidPostEndpoints();
    }

    @When("I send typo POST HTTP request")
    public void sendPostInvalidHttpRequest() {
        postProduct.sendInvalidPostHttpRequest();
    }

    //DELETE
    ///POSITIVE

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        deleteProduct.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        deleteProduct.sendDeleteHttpRequest();
    }


    ///NEGATIVE

    @Given("I set DELETE to invalid api endpoints")
    public void setInvalidDeleteApiEndpoints() {
        deleteProduct.setDeleteInvalidApiEndpoint();
    }

    @When("I send DELETE Invalid HTTP request")
    public void sendInvalidDeleteHttpRequest() {
        deleteProduct.sendInvalidDeleteHttpRequest();
    }

    @Then("I receive invalid HTTP response code 405 Not Found")
    public void reciveInvalidHttpResponseCode405() {

    }

}
