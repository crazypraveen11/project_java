package core_java;

import java.util.Scanner;

public class democontrolstatement 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        System.out.println("Enter your time");

        if (time <= 11) 
        {
            System.out.println("Good Morning");
        }
        else
        {
            System.out.println("Good Evening");
        }   
    }  
}
