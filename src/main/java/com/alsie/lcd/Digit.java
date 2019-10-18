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
public class Digit {

    int numero;
    Block top;
    BlockCommon mid;
    BlockCommon bottom;

    public Digit(int numero, Block top, BlockCommon mid, BlockCommon bottom) {
        this.top = top;
        this.mid = mid;
        this.bottom = bottom;
    }

    public String drawTop(int ancho, int alto, int resize) {
        return top.DrawBlock(top, ancho);
    }

    public String drawMid(int ancho, int alto, int resize) {
        return mid.DrawBlock(mid, ancho, alto, resize);
    }

    public String drawMid2(int ancho, int alto, String anterior) {
        return mid.DrawBlock2(mid, ancho, alto, anterior);
    }

    public String drawBottom(int ancho, int alto, int resize) {
        return bottom.DrawBlock(bottom, ancho, alto, resize);
    }

    public void draw(int ancho, int alto, int resize) {

        bottom.DrawBlock(bottom, ancho, alto, resize);
    }

}
