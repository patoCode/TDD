/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alsie.lcd;

/**
 *
 * @author osboxes
 */
public class DigitGenerator {

    Digit uno;
    Digit dos;
    Digit tres;
    Digit cuatro;
    Digit cinco;
    Digit seis;
    Digit siete;
    Digit ocho;
    Digit nueve;
    Digit cero;

    public DigitGenerator() {
        Block t = new Block(Simbol._NONE, Simbol._NONE, Simbol._NONE);
        BlockCommon m = new BlockCommon(Simbol._NONE, Simbol._NONE, Simbol._RIGHT);
        BlockCommon b = new BlockCommon(Simbol._NONE, Simbol._NONE, Simbol._RIGHT);
        uno = new Digit(1, t, m, b);

        Block t2 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m2 = new BlockCommon(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        BlockCommon b2 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._NONE);
        dos = new Digit(2, t2, m2, b2);

        Block t3 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m3 = new BlockCommon(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        BlockCommon b3 = new BlockCommon(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        tres = new Digit(3, t3, m3, b3);

        Block t4 = new Block(Simbol._NONE, Simbol._NONE, Simbol._NONE);
        BlockCommon m4 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        BlockCommon b4 = new BlockCommon(Simbol._NONE, Simbol._NONE, Simbol._RIGHT);
        cuatro = new Digit(4, t4, m4, b4);

        Block t5 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m5 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon b5 = new BlockCommon(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        cinco = new Digit(5, t5, m5, b5);

        Block t6 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m6 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon b6 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        seis = new Digit(6, t6, m6, b6);

        Block t7 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m7 = new BlockCommon(Simbol._NONE, Simbol._NONE, Simbol._RIGHT);
        BlockCommon b7 = new BlockCommon(Simbol._NONE, Simbol._NONE, Simbol._RIGHT);
        siete = new Digit(7, t7, m7, b7);

        Block t8 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m8 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        BlockCommon b8 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        ocho = new Digit(8, t8, m8, b8);

        Block t9 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m9 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        BlockCommon b9 = new BlockCommon(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        nueve = new Digit(9, t9, m9, b9);

        Block t0 = new Block(Simbol._NONE, Simbol._TOP_BOT_MID, Simbol._NONE);
        BlockCommon m0 = new BlockCommon(Simbol._LEFT, Simbol._NONE, Simbol._RIGHT);
        BlockCommon b0 = new BlockCommon(Simbol._LEFT, Simbol._TOP_BOT_MID, Simbol._RIGHT);
        cero = new Digit(0, t0, m0, b0);
    }

    public String Convertir(String numero, int ancho, int alto, int resize) {
        String res = "";
        for (int i = 0; i < numero.length(); i++) {
            char letra = numero.charAt(i);
            // TOP
            if (letra == '1') {
                res += uno.drawTop(ancho, alto, resize);
            }

            if (letra == '2') {
                res += dos.drawTop(ancho, alto, resize);
            }
            if (letra == '3') {
                res += tres.drawTop(ancho, alto, resize);
            }
            if (letra == '4') {
                res += cuatro.drawTop(ancho, alto, resize);
            }
            if (letra == '5') {
                res += cinco.drawTop(ancho, alto, resize);
            }
            if (letra == '6') {
                res += seis.drawTop(ancho, alto, resize);
            }
            if (letra == '7') {
                res += siete.drawTop(ancho, alto, resize);
            }
            if (letra == '8') {
                res += ocho.drawTop(ancho, alto, resize);
            }
            if (letra == '9') {
                res += nueve.drawTop(ancho, alto, resize);
            }
            if (letra == '0') {
                res += cero.drawTop(ancho, alto, resize);
            }
        }
        res += "\n";

        for (int i = 0; i < numero.length(); i++) {
            char letra = numero.charAt(i);
            // MID
            if (letra == '1') {
                res += uno.drawMid(ancho, alto, resize);
            }
            if (letra == '2') {
                res += dos.drawMid(ancho, alto, resize);
            }
            if (letra == '3') {
                res += tres.drawMid(ancho, alto, resize);
            }
            if (letra == '4') {
                res += cuatro.drawMid(ancho, alto, resize);
            }
            if (letra == '5') {
                res += cinco.drawMid(ancho, alto, resize);
            }
            if (letra == '6') {
                res += seis.drawMid(ancho, alto, resize);
            }
            if (letra == '7') {
                res += siete.drawMid(ancho, alto, resize);
            }
            if (letra == '8') {
                res += ocho.drawMid(ancho, alto, resize);
            }
            if (letra == '9') {
                res += nueve.drawMid(ancho, alto, resize);
            }
            if (letra == '0') {
                res += cero.drawMid(ancho, alto, resize);
            }
        }
        res += "\n";

        for (int i = 0; i < numero.length(); i++) {
            char letra = numero.charAt(i);
            // BOTTOM
            if (letra == '1') {
                res += uno.drawBottom(ancho, alto, resize);
            }
            if (letra == '2') {
                res += dos.drawBottom(ancho, alto, resize);
            }
            if (letra == '3') {
                res += tres.drawBottom(ancho, alto, resize);
            }
            if (letra == '4') {
                res += cuatro.drawBottom(ancho, alto, resize);
            }
            if (letra == '5') {
                res += cinco.drawBottom(ancho, alto, resize);
            }
            if (letra == '6') {
                res += seis.drawBottom(ancho, alto, resize);
            }
            if (letra == '7') {
                res += siete.drawBottom(ancho, alto, resize);
            }
            if (letra == '8') {
                res += ocho.drawBottom(ancho, alto, resize);
            }
            if (letra == '9') {
                res += nueve.drawBottom(ancho, alto, resize);
            }
            if (letra == '0') {
                res += cero.drawBottom(ancho, alto, resize);
            }

        }
        res += "\n";
        return res;
    }

}
