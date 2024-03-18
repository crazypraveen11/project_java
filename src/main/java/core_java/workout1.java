package core_java;

import java.util.Scanner;

public class workout1 {

    // static String name = "Praveenkumar";
    
    public static void main(String[] args) 
    {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = get.next();

        System.out.println("Enter any 0 - 11 number");
         
        int a = get.nextInt();

        char b = name.charAt(a);

        System.out.println("You chosen alphabet is " + b); 
    }
}
