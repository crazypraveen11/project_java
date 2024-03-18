package core_java;

import java.util.Scanner;

public class practice1 
{
    public static void mymethod(int a , String initial)
    {
        char letter = initial.charAt(6);
        System.out.println(a +"\t" + letter);
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Id");
        int a = scan.nextInt();

        System.out.println("Enter your initial");
        String initial = scan.next();

        practice1.mymethod(a, initial);
        
    }
}
