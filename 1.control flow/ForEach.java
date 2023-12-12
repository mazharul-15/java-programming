import java.util.*;

public class ForEach {
    

    /// main function
    public static void main(String args[]) {

        int arr[] = { 10, 30 , 40, 50};
        for(Object val : arr)
        {
            System.out.print(val + " ");
        }
        System.out.print("\n");

        String str[] = {"Abc", "bns", "Bangla"};
        for(Object st : str)
        {
            System.out.println(st);
        }
    }
}
