package core_java;

import java.util.Scanner;

public class workout {

    public static void  demovariable(String a, String b)
    {
        char c = a.charAt(0);
        char d = b.charAt(0);

        System.out.println(c + "\n" + d);
        
    }

    public static void main(String[] args) 
    {
       Scanner get = new Scanner(System.in);

       System.out.println("Enter your data");
       String data = get.next();

       System.out.println("Enter your name ");
       String name = get.next();
      
       workout.demovariable(data, name);
    }

    
}