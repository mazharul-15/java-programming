// Java Program for Parameterized Constructor
import java.io.*;
class Geek {
	// data members of the class.
	String name;
	int id;
    Geek() {
        System.out.println("Hello!!!");
    }

	Geek(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
class GFG {
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		//Geek geek1 = new Geek("avinash", 68);
        Geek gk = new Geek();
		//System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
	}
}

