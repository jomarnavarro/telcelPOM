package com.telcel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public LandingPage(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="[data-menusup='Logo']")
    WebElement LogoTelcel;

    @FindBy(css=".gluoTienda .text-option")
    WebElement linkTiendaEnLínea;

    @FindBy(css=".dropdown-menu [href='/personas/equipos/telefonos-y-smartphones']")
    WebElement linkTelefonosCelulares; //

    public void navegar(String url) {
        driver.get(url);

    }

    public void verificarPagina() {
        wait.until(ExpectedConditions.visibilityOf(LogoTelcel));
        wait.until(ExpectedConditions.visibilityOf(linkTiendaEnLínea));
    }

    public void seleccionarDeTiendaEnLinea(String opcion) {
        linkTiendaEnLínea.click();
        wait.until(ExpectedConditions.visibilityOf(linkTelefonosCelulares));
        linkTelefonosCelulares.click();
    }
}
