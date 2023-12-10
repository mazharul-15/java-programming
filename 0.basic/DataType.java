import java.util.*;

public class DataType {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean bl = true; /// 1 bit

        byte b = 4; /// 8 bit
        char c = 'A'; /// 16 bit

        short s = 34; /// 16 bit
        int a = 343487; /// 32 bit
        long ll = 34353252; /// 64 bit

        float fl = 3435.55f;  /// 32 bit
        double dl = 3434234.34322; // 64 bit
        
        System.out.println("boolean: "+ bl);
        System.out.println("byte: " + b);
        System.out.println("character: " + c);
        System.out.println("short: " + s);
        System.out.println("intger: " + a);
        System.out.println("long: " + ll);
        System.out.println("float: " + fl);
        System.out.println("double: " + dl);

        input.close();
    }
}
