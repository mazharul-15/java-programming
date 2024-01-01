import java.util.Scanner;

public class Intro {
    
    /// main function
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num;
        num = scn.nextInt();
        System.out.println("Premitive Data Type value: " + num);

        /// wrapper class
        Integer num2 = num;
        System.out.println("Wrapper class value: " + num2);


        scn.close();
    }
}
