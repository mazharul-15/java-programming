import java.util.*;

public class DataTypePractice {


    public int num;

    public void setValue() {

        Scanner input = new Scanner(System.in);
        this.num = input.nextInt();
    }

    public void getValue() {

        System.out.println("The Value of variable: " + this.num);
    }

    

    /// main function
    ///public static void main
    public static void main(String[] args) {
        
        DataTypePractice obj = new DataTypePractice();
        obj.setValue();
        obj.getValue();
    }   
}
