package com.babel.automation.ri.tasks;

import com.babel.automation.ri.pageObjects.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;

public class AbreLaWeb implements Task {

    public AbreLaWeb(){}
    private HomePage homePage = new HomePage();
    public static AbreLaWeb newTours(){
        return Tasks.instrumented(AbreLaWeb.class);
    }

    @Override
    @Step("Web Registro inmobiliario abierta")
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(homePage));
        Logger.getAnonymousLogger().info("Se abre la web del sistema de Registro Inmobiliario");
    }
}
