package com.telcel.pages;

import com.telcel.utils.Celular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaProducto {
    public WebDriver driver;
    public WebDriverWait wait;

    public PaginaProducto(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css=".ecommerce-ficha-tecnica-opciones-compra-titulo #ecommerce-ficha-tecnica-modelo")
    WebElement marca_ModeloCelular; //

    @FindBy(css=".ecommerce-ficha-tecnica-opciones-compra-titulo h1#ecommerce-ficha-tecnica-nombre")
    WebElement nombreCelular; //

    @FindBy(css=".ecommerce-ficha-tecnica-precio-pagos.ng-scope #ecommerce-ficha-tecnica-precio-obj")
    WebElement precioFinal; //

    @FindBy(css="[ng-repeat='cap in capacidades'] .ecommerce-ficha-tecnica-opciones-compra-capacidad")
    WebElement capacidadCelular; //

    public void verificarPagina() {

    }

    public void verificarInformacionCelular(Celular cel) {

    }
}
