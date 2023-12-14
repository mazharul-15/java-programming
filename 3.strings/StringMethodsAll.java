import java.util.*;

public class StringMethodsAll {
    

    /// main function
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        /// String concatenation
        String str = scn.nextLine();
        String str2 = scn.nextLine();

        str = str + str2;
        System.out.println(str);
        str = str.concat("Bangladesh");
        System.out.println(str);

        /// str.charAt(index)
        String str4 = "Bangldesh BD";
        for(int i = 0; i < str4.length(); i++) {
            System.out.print(str4.charAt(i) + " ");
        }

        /// string compare
        String s1 = "BD";
        String s2 = "CD";
        int val = s1.compareTo(s2);
        System.out.println(val);

        /// returning substring
        String s3 = "Bangladesh is my homland";
        String s4 = s3.substring(2, 5);
        System.out.println(s4);

        int id = s3.indexOf("ladesh");
        System.out.println(id);
        
        scn.close();
    }
}
