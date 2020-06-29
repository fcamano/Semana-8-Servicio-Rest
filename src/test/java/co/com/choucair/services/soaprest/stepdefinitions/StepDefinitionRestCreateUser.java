package co.com.choucair.services.soaprest.stepdefinitions;

import co.com.choucair.services.soaprest.Task.CreateUserRest;
import co.com.choucair.services.soaprest.models.ModelCreateUserRest;
import co.com.choucair.services.soaprest.questions.LastResponseStatusCode;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.List;

import static co.com.choucair.services.soaprest.utils.constant.VALUE;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {

    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRest){
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRest));

    }
    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));

    }
}
