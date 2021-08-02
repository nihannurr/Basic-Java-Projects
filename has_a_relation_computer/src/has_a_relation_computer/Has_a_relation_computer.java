package has_a_relation_computer;

public class Has_a_relation_computer {
    public static void main(String[] args) {
        
        Computer silly_computer = new Computer();
        silly_computer.printComputerInfo();
        
        CPU cpu = new CPU("AMD", "Ryen 9" , 3.6f, 3);
        RAM ram = new RAM("sgsagf", "rgdf", 16, 3);
        Secondary_Storage storage = new Secondary_Storage("asdgfsa", "asfsa", 5);
        
        
        
        Computer comp = new Computer(cpu ,ram, storage );
        System.out.println("\n"+comp.getComputerInfo()+"\n");
        
        
        
    }
    
}
