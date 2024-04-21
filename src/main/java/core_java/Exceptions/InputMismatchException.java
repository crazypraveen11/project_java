package core_java.Exceptions;
import java.util.Scanner;

public class InputMismatchException 
{
    public static void main(String[] args) 
    {
        try
        {
        int[] number = new int[2];
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your values ");
        int numbers = scan.nextInt();

        System.out.println(numbers);
        }
        catch(java.util.InputMismatchException im)
        {
            System.out.println(im +"Enter only Numeric values");
        }
    } 
}