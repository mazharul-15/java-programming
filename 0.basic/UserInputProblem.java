import java.util.*;

public class UserInputProblem {
    
    // main()
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String fName, lName;
        int age;
        double weight;
        
        System.out.println("Enter your first name: ");
        fName = scn.nextLine();
        
        System.out.println("Enter your age: ");
        age = Integer.parseInt(scn.nextLine());

        System.out.println("Enter your weight: ");
        weight = Double.parseDouble(scn.nextLine());

        System.out.println("Enter your last name: ");
        lName = scn.nextLine();

        System.out.println("Name: " + fName + " "+ lName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        
        scn.close();
    }
}
