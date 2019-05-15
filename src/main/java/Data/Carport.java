/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author shpattt
 */
public class Carport {
    private int length;
    private int width;
    private Roof roof;
    private ToolShed toolshed;
    

    public Carport(int length, int width, Roof roof, ToolShed toolshed) { 
        this.length = length;
        this.width = width;
        this.roof = roof;
        this.toolshed = toolshed;
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

    public ToolShed getToolshed() {
        return toolshed;
    }
}

 

   
