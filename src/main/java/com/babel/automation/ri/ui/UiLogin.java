package com.babel.automation.ri.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class UiLogin {

    public static final Target USER_FIELD = Target.the("Campo usuario").located(By.id("User"));
    public static final Target PASS_FIELD = Target.the("Campo clave").located(By.id("Password"));
    public static final Target LOGIN_BTN = Target.the("Botón submit").located(By.xpath("//button[@class='btn waves-effect waves-light border-round gradient-45deg-blue-grey-blue col s12']"));

    private UiLogin(){
        throw new IllegalStateException("Error UiLogin");
    }
}