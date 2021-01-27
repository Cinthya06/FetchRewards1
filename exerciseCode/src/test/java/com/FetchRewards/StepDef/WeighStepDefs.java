package com.FetchRewards.StepDef;


import com.FetchRewards.Pages.ActualWeighingClass;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WeighStepDefs {

    ActualWeighingClass weighingPage = new ActualWeighingClass();

    @When("User inputs value in left box")
    public void user_inputs_value_in_left_box() throws InterruptedException {
        weighingPage.inputValues();
    }

    @And("User compares Values")
    public void user_compares_Values() throws InterruptedException {

        weighingPage.findFakeNumber();
    }

    @Then("User verifies fake Bar")
    public void user_verifies_fake_bar() throws InterruptedException {

    weighingPage.clickingOnFakeNum();





    }


}

