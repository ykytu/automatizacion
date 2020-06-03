package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://translate.google.com/")
public class GoogleTraslatePage extends PageObject {

    public static final Target SELECT_OPTIONS_LANGUAGES = Target.the("button that show a list of languages")
            .located(By.xpath("(//div[@class='goog-inline-block jfk-button jfk-button-standard jfk-button-collapse-right jfk-button-checked'])"));
    public static final Target INPUT_FIRST_LANGUAGE = Target.the("space when the actor write the language")
        .located(By.id("sl_list-search-box"));
    public static final Target QUITAR_X = Target.the("alert message")
            .located(By.xpath("//div[@class='tlid-dismiss-button dismiss-button button']"));
    public static final Target SELECT_SECOND_LANGUAGE = Target.the("select second language")
            .located(By.xpath("//div[@class='goog-inline-block jfk-button jfk-button-standard jfk-button-collapse-right jfk-button-checked']"));

    public static final Target INTPUT_SECOND_LANGUAGE = Target.the("second language")
            .located(By.xpath("//*[@id=\"sl_list-search-box\"]"));
    public static final Target INPUT_FIRST_WORD = Target.the("space when the actor write the word")
            .located(By.xpath("//*[@id=\"source\"]"));




}






