/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Younes
 */
public class Order {
    
    private Carport carportOrdered;
    private final ArrayList<WoodRoofParts> woodRoofList = new ArrayList<>();
    private final ArrayList<FittingsScrewsParts> fittingsScrewsList = new ArrayList<>();

    public Order(Carport carportOrdered) {
        this.carportOrdered = carportOrdered;
    }

    public Carport getCarportOrdered() {
        return carportOrdered;
    }

    public ArrayList<WoodRoofParts> getWoodAndRoofList() {
        return woodRoofList;
    }

    public ArrayList<FittingsScrewsParts> getFittingsScrewsList() {
        return fittingsScrewsList;
    }
    
    
    
}