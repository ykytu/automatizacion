package co.com.choucair.certification.academy.tasks;
import co.com.choucair.certification.academy.model.GoogleTraslateData;
import co.com.choucair.certification.academy.userinterface.GoogleTraslatePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class Traducir implements Task {

    private GoogleTraslateData GoogletraslateData;
    public Traducir(List<GoogleTraslateData> GoogletraslateData) {

        this.GoogletraslateData = GoogletraslateData.get(0);
    }

    public static Traducir DeInglesAEspanol(List<GoogleTraslateData> GoogletraslateData) {
    return Tasks.instrumented(Traducir.class,GoogletraslateData);
    }

    @Override
    public < T extends Actor > void performAs(T actor){
     actor.attemptsTo(
             Click.on(GoogleTraslatePage.SELECT_OPTIONS_LANGUAGES),
             Enter.theValue(GoogletraslateData.getOrigin()).into(GoogleTraslatePage.INPUT_FIRST_LANGUAGE),
             Hit.the(Keys.ENTER).into(GoogleTraslatePage.INPUT_FIRST_LANGUAGE),
             Click.on(GoogleTraslatePage.QUITAR_X),
             Click.on(GoogleTraslatePage.SELECT_SECOND_LANGUAGE),
             Enter.theValue(GoogletraslateData.getDestiny()).into(GoogleTraslatePage.INTPUT_SECOND_LANGUAGE),
             Hit.the(Keys.ENTER).into(GoogleTraslatePage.INTPUT_SECOND_LANGUAGE),
             Enter.theValue(GoogletraslateData.getWordi()).into(GoogleTraslatePage.INPUT_FIRST_WORD));





        //
        //Hit.the(Keys.ENTER).into(GoogleTraslatePage.INTPUT_SECOND_LANGUAGE),
        //Enter.theValue(GoogletraslateData.getWordi()).into(GoogleTraslatePage.INPUT_FIRST_WORD),


    }
}
