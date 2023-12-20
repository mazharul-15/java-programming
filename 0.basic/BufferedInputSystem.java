import java.io.*;

public class BufferedInputSystem {
    
    /// main()
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int number;
        str = bfn.readLine();
        number = Integer.parseInt(bfn.readLine());

        System.out.println(str + " " + number);
    }
}
