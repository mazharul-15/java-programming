public class IntroEXCP {

    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 10;
        int num3;

        try
        {
            num3 = num1 / num2;
            System.out.println("Inside try block:  " + num3);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("The main function endedd!!!!");
    }
    
}
