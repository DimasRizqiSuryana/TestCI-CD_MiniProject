package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.POST_Category;

public class User_Category_steps {

    @Steps
    POST_Category postCategory;

    //POSTCategory
    ///POSITIVE

    @Given("I set POST category api endpoints")
    public void setPostCategoryApiEndpoints() {
        postCategory.setPostCategoryApiEndpoints();
    }

    @When("I send POST category HTTP request")
    public void sendPostCategoryHttpRequest() {
        postCategory.sendPostCategoryHttpRequest();
    }

    @Then("I receive valid data for new category posts")
    public void reciveValidDataNewCategoryPost() {
        postCategory.validateDataNewCategoryPost();
    }

    ///NEGATIVE

    @Given("I set typo POST category api endpoints")
    public void setInvalidPostCategoryApiEndpoints() {
        postCategory.setInvalidPostCategoryApiEndpoits();
    }
}
