package core_java;

import java.util.Scanner;

public class practice {
    
    public static void mymethod(String a , float b)
    {
        char c = a.charAt(4);
        int d = (int) b;
        System.out.println(c + "\n" + d);
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String a = scan.next();

        System.out.println("Enter your height");
        float b = scan.nextFloat();

        practice.mymethod(a, b);   
    }
}
