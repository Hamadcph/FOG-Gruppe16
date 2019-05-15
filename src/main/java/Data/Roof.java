package Data;

/**
 *
 * @author Hamad
 */
public class Roof {
    
    private int roofId;
    private boolean raised;
    private String type;
    private int roofInclination;
    private int price;

    public Roof(int roofId, boolean raised, String type, int roofInclination, int price) {
        this.roofId = roofId;
        this.raised = raised;
        this.type = type;
        this.roofInclination = roofInclination;
        this.price = price;
    }

    public int getRoofId() {
        return roofId;
    }

    public boolean isRaised() {
        return raised;
    }
    
    
    public String getType() {
        return type;
    }

  
    public int getRoofInclination() {
        return roofInclination;
    }

    public int getPrice() {
        return price;
    }

   
    

    
    
    
    
}
