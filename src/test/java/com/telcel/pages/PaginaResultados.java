package com.telcel.pages;

import com.telcel.utils.Celular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaResultados {

    public WebDriver driver;
    public WebDriverWait wait;

    public PaginaResultados(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".comp-telcel-mosaico-equipos")
    WebElement listaResultados; //

    @FindBy(css="p.telcel-mosaico-equipos-marca")
    WebElement marca_ModeloCelular; //

    @FindBy( css="p.telcel-mosaico-equipos-nombre-equipo")
    WebElement nombreCelular; //

    @FindBy(css="div.ng-scope > p.telcel-mosaico-equipos-precio")
    WebElement precioFinal; //

    @FindBy(css=".telcel-mosaico-equipos-capacidad-numero")
    WebElement capacidadCelular; //

    public void verificarPagina() {

    }

    public void verificarResultados() {

    }

    public Celular capturarInformacionCelular(int numCelular) {
        return null;
    }

    public void seleccionarCelular(int numCelular) {

    }

}
