package co.com.choucair.certification.academy.tasks;


import co.com.choucair.certification.academy.model.SearchCourseData;
import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Search implements Task {

    private SearchCourseData searchCourseData;
    // private String course;
    //private List<SearchCourseData> searchCourseData;

    /*public Search(String[] SearchCourseData) {
        this.searchCourseData = SearchCourseData[0];
    }*/
    public Search(List<SearchCourseData> searchCourseData) {
        this.searchCourseData = searchCourseData.get(0);
    }

    public static Search the(List<SearchCourseData> searchCourseData) {
        return Tasks.instrumented(Search.class, searchCourseData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(searchCourseData.getSearch()).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO)
               // Click.on(SearchCoursePage.SELECT_COURSE)
        );

    }
}
