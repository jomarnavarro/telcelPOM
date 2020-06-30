package com.telcel.tests;

import com.telcel.utils.Celular;
import org.junit.Test;

public class TestCelulares extends BaseTest {

    @Test
    public void testSeleccionarCelular() {
        landing.navegar("http://telcel.com/");
        landing.verificarPagina();
        landing.seleccionarDeTiendaEnLinea("smartphones");
//        busqueda.buscarPorMarca("Motorola");
        modalEstado.verificarPagina();
        modalEstado.seleccionarEstado("Tlaxcala");
        resultados.verificarPagina();
        resultados.verificarResultados();
        Celular elegido = resultados.capturarInformacionCelular(1);
        resultados.seleccionarCelular(1);
        producto.verificarPagina();
        producto.verificarInformacionCelular(elegido);
    }
}
