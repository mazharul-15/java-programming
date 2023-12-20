import java.util.*;

class Mobile {

    public int[] arr = new int[2];

    void setValue()
    {
        
        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            int val = scn.nextInt();
            arr[i] = val;
            //System.out.println("Called!!");
        }

        scn.close();
    }

    void getValue()
    {
        
        for(int i = 0; i < arr.length; i++)
        {    //System.out.println("Called!!");
            System.out.print(arr[i] +" ");
        }

        System.out.print("\n");
    }
}

public class Practice {
    
    // main function
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        Mobile[] Mb = new Mobile[2];

        for(int i  = 0; i < Mb.length; i++)
        {
            Mb[i] = new Mobile();
            Mb[i].setValue();
        }

        for(int i  = 0; i < Mb.length; i++)
        {
            Mb[i].getValue();
        }

        scn.close();
    }
}
