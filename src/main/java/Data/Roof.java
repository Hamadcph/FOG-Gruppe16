package Data;

/**
 *
 * @author Hamad
 */
public class Roof {
    
    private int roofId;
    private String description; 
    private boolean raised;
    private int price;

    public Roof(int roofId, String description, boolean raised, int price) {
        this.roofId = roofId;
        this.description = description;
        this.raised = raised;
        this.price = price;
    }

    public int getRoofId() {
        return roofId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRaised() {
        return raised;
    }

    public int getPrice() {
        return price;
    }
    

    

    
    
    
    
}
