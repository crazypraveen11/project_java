package core_java.Exceptions.workout;

public class runtime_exception 
{
    public static void main(String[] args) 
    {
        try
        {
            int []number = {1,2,3,4,5};
          System.out.println(number[7]);
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(ai + " <<< You entered the wrong index value >>>");
        }
        finally
        {
            System.out.println("Thank You...!");
        }

        
    }
    
}
