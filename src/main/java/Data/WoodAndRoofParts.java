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
public class WoodAndRoofParts extends Parts {
    private int length;
    
    
    public WoodAndRoofParts(String name, int quantity, String unit, int price, String description) {
        super(name, quantity, unit, price, description);
    }

    public int getLength() {
        return length;
    }
    
    
    
}
