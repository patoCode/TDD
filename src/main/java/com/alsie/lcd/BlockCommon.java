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
public class BlockCommon {

    String _left;
    String _right;
    String _mid;

    public BlockCommon(String _left, String _mid, String _right) {
        this._left = _left;
        this._right = _right;
        this._mid = _mid;
    }

    public String DrawBlock2(BlockCommon b, int ancho, int alto, String anterior) {
        String cadena = anterior;
        for (int i = 0; i < alto; i++) {
            if (i == alto - 1) {
                // FINAL
                //System.out.print(b._left);
                cadena += b._left;
                for (int j = 0; j < ancho; j++) {
                    //System.out.print(b._mid);
                    cadena += b._mid;
                }
                cadena += b._right;
                //System.out.print(b._right);

            } else {
                // NORMAL
                //System.out.print(b._left);
                cadena += b._left;
                for (int j = 0; j < ancho; j++) {
                    //System.out.print(Simbol._NONE);
                    cadena += Simbol._NONE;
                }
                //System.out.print(b._right);
                cadena += b._right;
            }
            //System.out.print(" ");
            cadena += " ";
        }
        return cadena;
    }

    public String DrawBlock(BlockCommon b, int ancho, int alto, int resize) {
        String cadena = "";
        for (int i = 0; i < alto; i++) {
            if (i == alto - 1) {
                // FINAL
                //System.out.print(b._left);
                cadena += b._left;
                for (int j = 0; j < ancho; j++) {
                    //System.out.print(b._mid);
                    cadena += b._mid;
                }
                cadena += b._right;
                //System.out.print(b._right);

            } else {
                // NORMAL
                //System.out.print(b._left);
                cadena += b._left;
                for (int j = 0; j < ancho; j++) {
                    //System.out.print(Simbol._NONE);
                    cadena += Simbol._NONE;
                }
                cadena += b._right;
                //System.out.print(b._right);
            }
            if (resize > 0) {
                cadena += "\n";
            }
            //System.out.print(" ");
        }
        return cadena;
    }
}
