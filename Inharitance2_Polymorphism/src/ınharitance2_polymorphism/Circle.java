
package ınharitance2_polymorphism;

public class Circle extends Shape{

    public Circle() {
    }

    public Circle(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw() {
        //super.draw(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("This is Circle's draw method");
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +'}';
    }
    
    
    
    
}
