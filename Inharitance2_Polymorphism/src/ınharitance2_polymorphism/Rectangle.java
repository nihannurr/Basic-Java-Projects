
package ınharitance2_polymorphism;

public class Rectangle extends Shape{
    
    public Rectangle(Point start, Point end) {
        super(start, end);
    }
    
    
    @Override
    public void draw() {
        System.out.println("This is Rectangle's draw method");
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() + '}';
    }
    
    
    
}
