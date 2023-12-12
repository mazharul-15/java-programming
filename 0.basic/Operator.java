import java.util.*;

public class Operator {
    
    /// main function
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n, m;

        n = scn.nextInt();
        m = scn.nextInt();

        String str = (n < m) ? "Yes" : "No";

        System.out.println(str);
    }
}
