package has_a_relation_computer;

public class CPU {
    private String brand,  model;
    private float speed;
    private int generation;
    
    public CPU(){
       brand = "UNKNOWN" ;
       model = "UNKONWN";
       speed = 0.0f;  
       generation = 0;
    }
    public CPU(String brand, String model, float speed, int generation) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.generation = generation;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    } 
    public void setModel(String model) {
        this.model = model;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
    } 
    public String getBrand() {
        return brand;
    } 
    public String getModel() {
        return model;
    }
    public float getSpeed() {
        return speed;
    }
    public int getGeneration() {
        return generation;
    }

    public String getCpu(){
        return ("brand: "+brand+"  model: "+ model + "  speed: "+speed+ "  generation: "+generation);
    }
     
    
    
}
