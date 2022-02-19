package com.babel.automation.ri.tasks;


import com.babel.automation.ri.models.CredencialesLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.babel.automation.ri.ui.UiLogin.*;

public class HaceLogin implements Task {

    CredencialesLogin credLogin;

    public HaceLogin(CredencialesLogin credLogin) {
        this.credLogin = credLogin;
    }

    public static HaceLogin correctamenteEnLaWeb(CredencialesLogin credLogin) {
        return Tasks.instrumented(HaceLogin.class, credLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_FIELD, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                Enter.theValue(credLogin.getUser()).into(USER_FIELD),
                Enter.theValue(credLogin.getPass()).into(PASS_FIELD),
                Click.on(LOGIN_BTN)
        );
    }
}
