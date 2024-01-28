import java.util.*;

public class BasicIO {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num1, num2, sum;
        num1 = scn.nextInt();
        num2 = scn.nextInt();

        sum = num1 + num2;

        System.out.print("Total sum = " + sum);
    }
}