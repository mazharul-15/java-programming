import java.io.*;

public class BufferReaderInput {
    

    /// main function
    public static void main(String[] args) 
        throws IOException
    {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String str = bfn.readLine();
        
        int it = Integer.parseInt(bfn.readLine());

        System.out.println("String: " + str);
        System.out.println("Integer: " + it);
    }
}
