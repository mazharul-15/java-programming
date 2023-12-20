import java.util.*;

abstract class Shape {
    public String color;

    /// constractor of abstract class
    Shape()
    {

    }

    Shape(String color)
    {
        this.color = color;
    }

    /// abstract method
    abstract void draw();

    /// non-abstract method
    void func() {
        
    }
}

class Circle extends Shape {
    public int id;

    /// constructor of concrete class
    Circle() 
    {
        /// calling "Abstract class constructor"
        super();
    }

    Circle(String color, int id)
    {
        super(color);
        this.id = id;
    }

    @Override void draw() {
        System.out.println("Draw the circle!!");
        System.out.println(this.color + " " + this.id);
    }
}


public class PracticeAbstron {
        
    /// main()
    public static void main(String[] args)
    {
        Circle obj = new Circle("Red", 123);
        obj.draw();
    }
}
