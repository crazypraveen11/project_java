package core_java.Exceptions;

import java.util.Scanner;

public class Errorhandling_basic 
{
    public static void main(String[] args) 
    {
        
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter A value");
           int a = scan.nextInt();
        System.out.println("Enter B value");
        int b = scan.nextInt();
         System.out.println(a/b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println( " You entered zero enter the correct numeric values...!" );
            try
            {
                Scanner scan = new Scanner(System.in);
            System.out.println("Enter A value");
           int a = scan.nextInt();
        System.out.println("Enter B value");
        int b = scan.nextInt();
         System.out.println(a/b);
            }
            catch(ArithmeticException a)
            {
                System.out.println("Enter non-zero values");
            }
        }
        
    }
    
}
