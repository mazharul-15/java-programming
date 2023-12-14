import java.util.*;

public class Multidimention {
    
    // main function
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[][] arr = new int[3][3];

        /// taking input
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                arr[i][j] = scn.nextInt();

            }
        }

        /// output
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                
                System.out.print(arr[i][j] + " ");
            }

            System.out.print("\n");
        }

        scn.close();
    } 
}
