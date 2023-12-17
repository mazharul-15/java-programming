import java.util.*;

class A {
    private int id;
}

class B extends A {
    public int value;

    B() {
        System.out.println("Sub-class constructor is called!!!");
    }
}

public class Car {
    
    // main function
    public static void main(String[] args)
    {
        B obj = new B();
    }
}
