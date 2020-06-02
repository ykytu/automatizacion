package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.SearchCourseData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Kathe");
    }

    @Given("^than brandom wants to learn automation at the academy Choucair$")
    public void thanBrandomWantsToLearnAutomationAtTheAcademyChoucair()  {

        OnStage.theActorCalled("Kathe").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }


  @When("^he search for the course on the choucair academy platform$")
  public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<SearchCourseData> searchCourseData)  {
      OnStage.theActorInTheSpotlight().attemptsTo(Search.the(searchCourseData));


  }

    @Then("^he finds the course called resourses (.*)$")
    public void heFindsTheCourseCalledResoursesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
