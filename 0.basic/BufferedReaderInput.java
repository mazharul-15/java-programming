import java.io.*;


public class BufferedReaderInput {
    

    /// main function
    public static void main(String args[])
        throws IOException
    {
        // input via BufferedReader
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        
        int val = Integer.parseInt(bfn.readLine());
        String str = bfn.readLine();
        //int val = Integer.parseInt(bfn.readLine());

        System.out.println(str);
        System.out.println(val);

        bfn.close();
    }
}
