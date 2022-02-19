package com.babel.automation.ri.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.babel.automation.ri.ui.UiHome.MSG_LOGIN_SUCCESSFULLY;


public class MensajeDeLogin implements Question<String> {
    String mensaje;

    public MensajeDeLogin(String mensaje) {
        this.mensaje = mensaje;
    }

    public static MensajeDeLogin bienvenida(String mensaje){ return new MensajeDeLogin(mensaje);}

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(MSG_LOGIN_SUCCESSFULLY, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds()
        );
        return Text.of(MSG_LOGIN_SUCCESSFULLY).viewedBy(actor).asString();
    }
}
