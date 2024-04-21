package core_java.Exceptions;

public class task1 
{
    public static void main(String[] args) 
    {
        try
        {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(numbers[11]);
        
        }
        catch(ArrayIndexOutOfBoundsException ai)   
        
        {
            System.out.println( ai + "\n <<< You entered the out of index values >>>");

            // try
            // {
            //     int [] numbers1 = {1,2,3};
            //    System.out.println("value is " + numbers1[2]);
            // }
            // catch(Exception ar)
            // {
            //     System.out.println(" You entered the index increased level");
            // }
        }
        finally
        {
            System.out.println("Output is getted ");
        }

        /* Exceptions
         *  1) Try
         *  2) Catch
         *  3) Finally
         *  4) Throw
         *  5) Throws
         */
        
    }
    
}
