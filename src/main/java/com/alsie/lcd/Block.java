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
public class Block {

    String _left;
    String _right;
    String _mid;

    public Block(String _left, String _mid, String _right) {
        this._left = _left;
        this._right = _right;
        this._mid = _mid;
    }

    public String DrawBlock(Block b, int ancho) {
        String cadena = "";
        //System.out.print(b._left);
        cadena += b._left;
        String mid = "";
        for (int i = 0; i < ancho; i++) {
            mid += b._mid;
        }
        //System.out.print(mid);
        cadena += mid;
        cadena += b._right;
        //cadena += "\n";
        return cadena;
//        System.out.print(b._right);
//        System.out.print(" ");
    }

}
