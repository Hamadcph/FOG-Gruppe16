/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author shpattt
 */
public class Carport {
    private int length;
    private int width;
    private String roofstyle;

    @Override
    public String toString() {
        return "Carport{" + "length=" + length + ", width=" + width + ", roofstyle=" + roofstyle + '}';
    }
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Carport(int length, int width, String roofstyle) {
        this.length = length;
        this.width = width;
        this.roofstyle = roofstyle;
    }

    public String getRoofstyle() {
        return roofstyle;
    }

    public void setRoofstyle(String roofstyle) {
        this.roofstyle = roofstyle;
    }
}
