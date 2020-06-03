package co.com.choucair.certification.academy.stepdefinitions;
import co.com.choucair.certification.academy.model.GoogleTraslateData;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Traducir;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;



import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GoogleTraslateDataStepDefinitions{

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("kathe");
    }


    @Given("^than kathe wants to use google traductor$")
    public void thanKatheWantsToUseGoogleTraductor() {

        OnStage.theActorCalled("kathe").wasAbleTo(OpenUp.thePage());
    }

    @When("^she translate a word of English to Spanish$")
    public void sheTranslateAWordOfEnglishToSpanish(List<GoogleTraslateData> GoogletraslateData) {

        OnStage.theActorCalled("kathe").attemptsTo(Traducir.DeInglesAEspanol(GoogletraslateData));

    }

    @Then("^she would to see the word translate in origin language to destiny language$")
    public void sheWouldToSeeTheWordTranslateInOriginLanguageToDestinyLanguage(DataTable arg1) {

    }
}
