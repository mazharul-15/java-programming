import java.util.*;

interface AB {
    

    void display();

    int mn = 10;

}

class CD implements AB {

    @Override public void display() 
    {
        System.out.println("This is Child Class");
        System.out.println("Value: " + mn);
    }
}



public class Interfacing {
    
    /// main function
    public static void main(String[] args)
    {
        CD obj = new CD();
        obj.display();
    }
}
