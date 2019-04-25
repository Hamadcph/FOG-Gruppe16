package DataLayer;

/**
 *
 * @author Hamad
 */
public class Material {

    private String name;
    private int quantity;
    private int price;
    private String description;

    public Material(String name, int quantity, int price, String description) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material{" + "name=" + name + ", quantity=" + quantity + ", price=" + price + ", description=" + description + '}';
    }

}
