package Data;

/**
 *
 * @author Hamad
 */
public class Roof {
    
    private int roofId;
    private boolean raised;
    private String type;
  

    public Roof(int roofId, boolean raised, String type) {
        this.roofId = roofId;
        this.raised = raised;
        this.type = type;
        
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

  

   
    

    
    
    
    
}
