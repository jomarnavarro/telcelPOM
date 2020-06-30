package com.telcel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaBusqueda {

    public WebDriver driver;
    public WebDriverWait wait;

    public PaginaBusqueda(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public void buscarPorMarca(String motorola) {
        System.out.println("Dummy");
    }
}
