import java.util.*;

public class Infro {
    
    private int n;

    public void setValue() {
        
        Scanner scn = new Scanner(System.in);
        this.n = scn.nextInt();
        System.out.println("value of n: " + this.n);
        scn.close();
    }

    public void printValue() {
        System.out.println("value of n : " + this.n);
        Scanner scn = new Scanner(System.in);
        
        for(int i = 0; i < this.n; i++) {

            int val = scn.nextInt();
            System.out.println("Present Value: " + val);
        }

        scn.close();
    }

    /// main function
    public static void main(String[] args) {

        Infro obj = new Infro();
        obj.setValue();
        obj.printValue();
    }
}
