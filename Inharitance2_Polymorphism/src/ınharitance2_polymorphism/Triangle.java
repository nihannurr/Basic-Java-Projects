
package ınharitance2_polymorphism;

public class Triangle extends Shape{

    public Triangle(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw() {
        //super.draw(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("This is Triangle's draw method");
    }

    @Override
    public String toString() {
        return "Triangle{" + super.toString() +'}';
    }
    
    
    
    
}
