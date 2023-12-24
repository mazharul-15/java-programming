import java.util.Scanner;

public class IntroL {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        ///System.out.println("Hello World!");
        int arr[] = new int[5];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] val = {1,2,3, 4, 5, 6};
        System.out.println(val.length);

        scn.close();
    }
}
