package core_java.Exceptions;


import java.util.Scanner;

public class basic_throws_exception 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name");
        int name = scan.nextInt();
        System.out.println(name);
        }
        catch(InputMismatchException im)
        {
            System.out.println(" You can only enter numeric values");
        }

    }
    
}
