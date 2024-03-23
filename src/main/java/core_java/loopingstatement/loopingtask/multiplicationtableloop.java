package core_java.loopingstatement.loopingtask;

import java.util.Scanner;

public class multiplicationtableloop 
{ 
    static Scanner scan = new Scanner(System.in);
    public static void demovalue()
    {
        System.out.println("Enter Your Number");
        int n = scan.nextInt();
        int i = 1;
        while ( i <= 10 )
        {
            System.out.println(n + " * " + i + " = " + n*i );
            i++;
        }
    }

    public static void main(String[] args) 
    {

        multiplicationtableloop.demovalue();
    }
    
}
