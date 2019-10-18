/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alsie.lcd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author osboxes
 */
public class DigitGeneratorTest {

    DigitGenerator generador = new DigitGenerator();

    @Test
    public void testConvertir() {
        String resultado = generador.Convertir("123", 1, 1, 0);
        String esperado = "...._.._.\n"
                + "..|._|._|\n"
                + "..||_.._|\n";
        assertEquals(esperado, resultado);

    }

    public void testConvertir34() {
        String resultado = generador.Convertir("34", 1, 1, 0);
        String esperado = "._....\n"
                + "._||_|\n"
                + "._|..|\n";
        assertEquals(esperado, resultado);

    }

    public void testConvertir00() {
        String resultado = generador.Convertir("000000", 1, 1, 0);
        String esperado = "._.._.._.._.._.._.\n"
                + "|.||.||.||.||.||.|\n"
                + "|_||_||_||_||_||_|\n";
        assertEquals(esperado, resultado);

    }

    public void testSize() {
        String resultado = generador.Convertir("2", 3, 2, 1);
        String esperado = ".___.\n"
                + "....|\n"
                + ".___|\n"
                + "\n"
                + "|....\n"
                + "|___.\n"
                + "\n";
        assertEquals(esperado, resultado);

    }

}
