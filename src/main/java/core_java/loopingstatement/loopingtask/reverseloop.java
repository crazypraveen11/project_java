package core_java.loopingstatement.loopingtask;

import java.util.Scanner;

public class reverseloop 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {

        System.out.println("Enter Your Name to Reverse");

        String name = scan.next();
        int length = name.length();
        // String reverse = "";

        // for( int i = length - 1 ; i>=0 ; --i )
        // {
        //     reverse += name.charAt(i);
        // }
        // System.out.println(reverse);

        int i = length - 1;
        String reverse = "";
        do
        {
            reverse += name.charAt(i);
            System.out.println(reverse);
            --i;
        }
        while( i>=0 );
    }
}
