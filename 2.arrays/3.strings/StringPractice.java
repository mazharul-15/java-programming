import java.util.*;

public class StringPractice {

    private String str;
    
    // user-defined function
    public void setValue() {
        Scanner scn = new Scanner(System.in);
        this.str = scn.nextLine();

        scn.close();
    }
    
    public void getValue() {
        System.out.println(this.str);
    }

    public int length() {
        return this.str.length();
    }

    public void stringConcat() {
        this.str = this.str + "Bangladesh";
    }

    public char charReturn(int id) {

        return this.str.charAt(id);
    }

    public String stringCompare(String str1) {
        
        String ans;
        int fl = this.str.compareTo(str1);
        if(fl == 0) ans = "Equal";
        else if(fl < 0) ans = "String1 small";
        else ans = "String1 is big";

        return ans;
    }


    /// main function
    public static void main(String args[]) {

        StringPractice obj = new StringPractice();
        obj.setValue();
        obj.getValue();

        int stringLen = obj.length();
        System.out.println(stringLen);
        
        obj.stringConcat();
        obj.getValue();

        char ch = obj.charReturn(stringLen-1);
        System.out.println(ch);

        String ans = obj.stringCompare("Bangladesh");
        System.out.println(ans);
    }
}
