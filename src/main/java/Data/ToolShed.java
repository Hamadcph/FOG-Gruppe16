/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Younes
 */
public class ToolShed {
    
    private int width;
    private int length;
    private int price;

    public ToolShed(int width, int length, int price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }
    
    

    @Override
    public String toString() {
        return "ToolShed{" + "width=" + width + ", length=" + length + '}';
    }
    
    
    
}

