package has_a_relation_computer;

public class RAM {
    private String brand;
    private String type;
    private int capacity;
    private float speed;

    public RAM() {
        brand = "UNKNOWN";
        type = "UNKNOWN";
        capacity = 0;
        speed = 5; 
    }

    public RAM(String brand, String type, float speed, int capacity) {
        this.brand = brand;
        this.type = type;
        this.speed = speed;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }
    public String getType() {
        return type;
    }
    public float getSpeed() {
        return speed;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRam(){
        return ("brand: "+brand+"  type: "+ type + "  speed: "+speed+ "  capacity: "+capacity);
    }
    
    
    
}

