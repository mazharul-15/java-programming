import java.util.*;

public class InputInJava {
    
    private char ch;
    private double dl;
    private byte bt;

    /// user-defined methods
    public void setValue() {
        
        Scanner scn = new Scanner(System.in);

        this.ch = scn.next().charAt(0);
        this.dl = scn.nextDouble();
        this.bt = scn.nextByte();

        scn.close();
    }

    public void getValue() {
        
        System.out.println("Character: " + ch);
        System.out.println("Double: " + dl);
        System.out.println("Byte: " + bt);
        System.out.print(100);
    }

    /// main functin
    public static void main(String[] args) {

        InputInJava obj = new InputInJava();
        obj.setValue();
        obj.getValue();

    }
}
