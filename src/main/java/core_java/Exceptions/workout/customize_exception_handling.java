package core_java.Exceptions.workout;

import java.util.Scanner;

public class customize_exception_handling 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        try
        {
            if(18 <= age)
            
                System.out.println("something wrong");
            
            throw new customize_exception() ;
        }
        catch(customize_exception ce)
        {
            System.out.println(ce);
        }
        
    }
    
}
