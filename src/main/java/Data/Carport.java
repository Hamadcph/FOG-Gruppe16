/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author shpattt
 */
public class Carport {
    private int length;
    private int width;
    private String roof;
    private int incline;

    public Carport(int length, int width, String roof, int incline) {
        this.length = length;
        this.width = width;
        this.roof = roof;
        this.incline = incline;
    }

    public Carport(int length, int width, String roof) {
        this.length = length;
        this.width = width;
        this.roof = roof;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getRoof() {
        return roof;
    }

    public int getIncline() {
        return incline;
    }

   
    
    
}
