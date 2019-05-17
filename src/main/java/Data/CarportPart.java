/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.Product;

/**
 *
 * @author Hamad
 */
public class CarportPart {
    
    private Product product;
    private int amount;

    public CarportPart(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
    
    public Product getProduct(){
        return product;
    }
    
    public int getAmount(){
        return amount;
    }
    
}
