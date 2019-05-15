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
public class WoodRoofParts extends Parts {
    private int length;
    
    
    public WoodRoofParts(String name, int quantity, String unit, String description) {
        super(name, quantity, unit, description);
    }

    public int getLength() {
        return length;
    }
    
    
    
}
