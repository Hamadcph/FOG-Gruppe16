package Data;

/**
 *
 * @author Hamad
 */
public class Parts {

    private String name;
    private int quantity;
    private String unit;
    private String description;

    public Parts(String name, int quantity, String unit, String description) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }


    public String getDescription() {
        return description;
    }

    

 

}
