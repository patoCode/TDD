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
        String resultado = generador.Convertir("123", 1, 1);
        String esperado = "";
        assertEquals(esperado, resultado);

    }

}
