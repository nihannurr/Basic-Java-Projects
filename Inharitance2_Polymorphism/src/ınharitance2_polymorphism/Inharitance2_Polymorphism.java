package ınharitance2_polymorphism;

public class Inharitance2_Polymorphism {

    public static void main(String[] args) {
        
        final int SHAPE_COUNT = 10;
        final int SHAPE_TYPES = 3;
        final int SHAPE_RECTANGLE = 0;
        final int SHAPE_CIRCLE = 1;
        final int SHAPE_TRIANGLE = 2;
        
        Shape[] shapes = new Shape[SHAPE_COUNT];
        
        for(int i=0; i < shapes.length; ++i){
            int type = (int)(Math.random() * SHAPE_TYPES);
            switch(type){
                case SHAPE_RECTANGLE:
                    shapes[i] = new Rectangle(new Point(), new Point());
                    break;
                case SHAPE_CIRCLE:
                    shapes[i] = new Circle(new Point(), new Point());
                    break;  
                case SHAPE_TRIANGLE:
                    shapes[i] = new Triangle(new Point(), new Point());
                    break;
            }
        }
        
        for(int i=0; i < shapes.length ; ++i)
            shapes[i].draw();
        
        
                
    }  
}
