package Data;

/**
 *
 * @author Hamad
 */
public class Parts {

    private String name;
    private int quantity;
    private String unit;
    private int price;
    private String description;

    public Parts(String name, int quantity, String unit, int price, String description) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Parts{" + "name=" + name + ", quantity=" + quantity + ", unit=" + unit + ", price=" + price + ", description=" + description + '}';
    }

 

}
