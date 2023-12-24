import java.util.*;

public class StringIntroduction {
    
    // main function
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String str[] = new String[3];

        for(int i = 0; i < str.length; i++)
        {
            str[i] = scn.nextLine();
        }

        for(int i = 0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
}
