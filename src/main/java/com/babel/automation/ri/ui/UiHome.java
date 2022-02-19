package com.babel.automation.ri.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UiHome {

    public static final Target MSG_LOGIN_SUCCESSFULLY = Target.the("Mensaje de bienvenida").located(By.xpath("//span[@class='logo-text hide-on-med-and-down']"));

    private UiHome(){
        throw new IllegalStateException("Error UiHome");
    }
}
