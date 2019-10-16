/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alsie.lcd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author osboxes
 */
public class TestMain {

    public static void main(String[] args) {

        String numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introdusza un numero:");
        numero = teclado.nextLine();
        DigitGenerator generador;
        generador = new DigitGenerator();
        String cadena = generador.Convertir(numero, 1, 1);
        System.out.println(cadena);
    }

}
