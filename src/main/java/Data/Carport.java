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
    private int roofInclination;
    private ToolShed toolshed;
    private ArrayList<Parts> partsList = new ArrayList<Parts>();

    public Carport(int length, int width, Roof roof, int roofInclination, ToolShed toolshed) {
        this.length = length;
        this.width = width;
        this.roof = roof;
        this.roofInclination = roofInclination;
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

    public int getRoofInclination() {
        return roofInclination;
    }

    public ArrayList<Parts> getPartsList() {
        return partsList;
    }

    @Override
    public String toString() {
        return "Carport{" + "length=" + length + ", width=" + width + ", roof=" + roof + ", roofInclination=" + roofInclination + ", toolshed=" + toolshed + ", partsList=" + partsList + '}';
    }
    
}

   
