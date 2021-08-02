package has_a_relation_computer;

public class Secondary_Storage {
    
    private String brand;
    private String type;
    private int capacity;

    public Secondary_Storage() {
        
        brand = "UNKNOWN";
        type = "UNKNOWN";
        capacity = 0;
        
    }

    
    public Secondary_Storage(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }
    public String getType() {
        return type;
    }
    public int getCapacity() {
        return capacity;
    }

    public String getStorage(){
        return ("brand: "+brand+"  type: "+ type + "  capacity: "+capacity);
    }
    
    
    
    
}
