
package ınharitance2_polymorphism;

public abstract class Shape {
    
    private Point start;
    private Point end;

    public abstract void draw();
    
    public Shape() {
        this(new Point(0,0), new Point(0,0));
//        start = new Point(0, 0);
//        end = new Point(0, 0);
    }
    public Shape(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public String toString() {
        return "Shape{" + "start=" + start + ", end=" + end + '}';
    }   
    
    public Point getStart() {
        return start;
    }
    public void setStart(Point start) {
        this.start = start;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

     
    
    
}
