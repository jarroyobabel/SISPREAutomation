@Author Jose Arroyo

@Login
Feature: Como usuario de registro inmobiliario
  Quiero ingresar al sitio web
  Para/con el objetivo de realizar transacciones

  @LoginExitoso
  Scenario Outline: Intento de realizar login exitoso en la web de registro inmobiliario
    Given Que <nombre> esta en la web de registro inmobiliario
    When Diligencia el formulario del ingreso a la web
      |user|pass|
      |<user>|<pass>|
    Then y vera el mensaje <msn_login>

    Examples:
      |user|pass|msn_login|
      |admin|vision123|SISPRE|