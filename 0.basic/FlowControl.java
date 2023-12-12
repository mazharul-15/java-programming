import java.util.*;

public class FlowControl {
    
    /// main function
    public static void main(String[] agrs) {

        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            int number = scn.nextInt();
            System.out.println("Value: " + number);
        }

        //int i = scn.nextInt();
        int n = scn.nextInt();
        
        if(n % 2 == 1) {
            System.out.println("Number is odd\n");
        }
        else {
            System.out.println("Number is Even\n");
        }
        for(int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        scn.close();
    }
}
