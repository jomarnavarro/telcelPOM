package com.telcel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalSeleccionEstado {

    public WebDriver driver;
    public WebDriverWait wait;

    public ModalSeleccionEstado(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 50);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".modal .chosen-single > span")
    WebElement seleccionaEstadoDropdown; //

    @FindBy(css=".chosen-search > input")
    WebElement campoBusquedaEstado; //

    @FindBy(css=".chosen-results .active-result")
    WebElement ligaEstado; //

    @FindBy(css="#entrarPerfilador")
    WebElement botonEntrar; //

    public void verificarPagina() {
        wait.until(ExpectedConditions.elementToBeClickable(seleccionaEstadoDropdown));

    }
    public void seleccionarEstado(String estado) {
        seleccionaEstadoDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(campoBusquedaEstado));
        campoBusquedaEstado.sendKeys(estado);
        wait.until(ExpectedConditions.visibilityOf(ligaEstado));
        ligaEstado.click();
        botonEntrar.click();

    }

}
