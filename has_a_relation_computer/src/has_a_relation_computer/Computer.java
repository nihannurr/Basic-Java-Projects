package has_a_relation_computer;

import java.util.logging.Logger;

public class Computer {
    
    //"HAS A RELATION" number variables/objests/references
    private CPU cpu;   //cpu sınıfı türüncden REFERANS
    private RAM ram;
    private Secondary_Storage storage;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        storage = new Secondary_Storage();
    }

    public Computer(CPU cpu, RAM ram, Secondary_Storage storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    
    
    public void printComputerInfo(){           
                
    System.out.println( "CPU: "+cpu.getCpu()+ "\nRAM:" +ram.getRam()+"\nStorage:  " +storage.getStorage());
                 
    }
   
    public String getComputerInfo(){           
                
    return ( "CPU: "+cpu.getCpu()+ "\nRAM:" +ram.getRam()+"\nStorage:  " +storage.getStorage());
                 
    }
    
    
}
