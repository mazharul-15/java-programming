import java.util.*;

public class StringBuilders {
    
    /// main function
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scn.nextLine()); //= new StringBuilder();

        /// str.append(scn.nexLine())
        str.setCharAt(str.length()-1, 'A');

        System.out.println(str);
        
        scn.close();
    }
}
