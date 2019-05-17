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
    private Roof roof;
    private int incline;
    private ToolShed toolshed;

    public Carport(int length, int width, Roof roof, int incline, ToolShed toolshed) { // Carport med rejsning og skur
        this.length = length;
        this.width = width;
        this.roof = roof;
        this.incline = incline;
        this.toolshed = toolshed;
    }
    
     public Carport(int length, int width, Roof roof, ToolShed toolShed) { // Carport fladt med skur
        this.length = length;
        this.width = width;
        this.roof = roof;
        this.toolshed = toolshed;
      }

    public Carport(int length, int width, Roof roof) { // Carport fladt
        this.length = length;
        this.width = width;
        this.roof = roof;
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

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public int getIncline() {
        return incline;
    }

    public void setIncline(int incline) {
        this.incline = incline;
    }

    @Override
    public String toString() {
        return "Carport{" + "length=" + length + ", width=" + width + ", roof=" + roof + ", incline=" + incline + '}';
    }
    
    
    
    
}
