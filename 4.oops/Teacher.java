import java.util.*;

class Hello {

    private int id;

    Hello(int id)
    {
        this.id = id;
        System.out.println("Hello!!!1");
    }

    public void getValue() {
        System.out.println("The value is: " + this.id);
    }
}

public class Teacher {

    public static void main(String[] args)
    {
        Hello obj = new Hello(123);
        obj.getValue();

    }
    
}
