package DataLayer;

/**
 *
 * @author Hamad
 */
public class Roof {
    
    private String type; 
    private String colour; 
    private int inclination;

    public Roof(String type, String colour, int inclination) {
        this.type = type;
        this.colour = colour;
        this.inclination = inclination;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getInclination() {
        return inclination;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setInclination(int inclination) {
        this.inclination = inclination;
    }

    @Override
    public String toString() {
        return "Roof{" + "type=" + type + ", colour=" + colour + ", inclination=" + inclination + '}';
    }
    
    
    
}
