package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GET_Commant;
import starter.user.GET_Rating;
import starter.user.POST_Commant;
import starter.user.POST_Rating;

public class User_RatingandComment_steps {

    @Steps
    POST_Rating postRatingComment;

    @Steps
    GET_Rating getRatingComment;

    @Steps
    POST_Commant postCommant;

    @Steps
    GET_Commant getCommant;

    ///POSTRating
    ///POSITIVE
    @Given("I set POST rating api endpoints")
    public void setPostRatingApiEndpoints() {
        postRatingComment.setPostRatingApiEndpoints();
    }

    @When("I send POST rating HTTP request")
    public void sendPostRatingHttpRating() {
        postRatingComment.sendPostRatingHttpRequest();
    }



    ///NEGAATIVE

    @Given("I set typo POST rating api endpoints")
    public void setTypoPostRatingApiEndpoints() {
        postRatingComment.setTypoPostRatingApiEndpoints();
    }


    //GET
    ///POSITIVE

    @Given("I set GET rating api endpoints")
    public void setGetRatingApiEndpoints() {
        getRatingComment.setGetRatingApiEndpoints();
    }

    @When("I send GET rating HTTP request")
    public void sendGetRatingHttpRequest() {
        getRatingComment.senGetRatingHttpRequest();
    }

    @And("I receive valid data for all of the posts rating")
    public void reciveDataGetRating() {
        getRatingComment.validateDataGetRating();
    }

    ///NEGATIVE

    @Given("I set typo GET rating api endpoints")
    public void setInvalidGetRatingApiEndpoints() {
        getRatingComment.setInvalidGetRatingEndpoints();
    }

    @When("I send typo GET rating HTTP request")
    public void sendInvalidGetApiHttpRequest() {
        getRatingComment.sendInvalidGetRatingHttpRequest();
    }

    //POSTComannt
    ///POSITIVE

    @Given("I set POST commant api endpoints")
    public void setPostCommantApiEndpoints() {
        postCommant.setPostCommantHttpRequest();
    }

    @When("I send POST commant HTTP request")
    public void sendPostCommantHttpRequest() {
        postCommant.sendPostCommantHttpRequest();
    }

    ///NEGATIVE

    @Given("I set typo POST commant api endpoints")
    public void setInvalidPostCommantEndpoints() {
        postCommant.setInvalidPostCommantEndpoints();
    }

    //GETCommant
    ///POSITIVE

    @Given("I set GET commant api endpoints")
    public void setGetCommantApiEndpoints() {
        getCommant.setGetCommantApiEndpoints();
    }

    @When("I send GET commant HTTP request")
    public void sendGetCommantHttpRequest() {
        getCommant.sendGetCommantHttpRequest();
    }

    //NEGATIVE

    @Given("I set typo GET commant api endpoints")
    public void setInvalidGetCommantApiEndpoints() {
        getCommant.setInvalidGetCommantApiEndpoints();
    }

}
