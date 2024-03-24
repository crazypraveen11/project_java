package core_java.loopingstatement.loopingtask;

import java.util.Scanner;

public class odd_even_dowhile 
{

    static Scanner scan = new Scanner(System.in);

    public static void evenvalues(int evennumber)
    {
        do
        {
            if( evennumber%2 == 0)
            {
                System.out.println( evennumber + " This is a Even Number");
            }
            evennumber++;
        }
        while ( evennumber <= 10 );
    }
    public static void  oddvalues(int oddnumber)
    {
        do
        {
            if ( oddnumber % 2 != 0) 
            {
              System.out.println( oddnumber + " This is a Odd Number ");   
            }
            oddnumber++;
        }
        while( oddnumber <= 10 );
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter your Number");
        int evennumber = scan.nextInt();
        evenvalues(evennumber);
        System.out.println("Enter Your Number");
        int oddnumber = scan.nextInt();
        oddvalues(oddnumber);
    }
}
