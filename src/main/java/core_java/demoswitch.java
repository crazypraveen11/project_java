package core_java;

import java.util.Scanner;

public class demoswitch 
{
   static  Scanner scan = new Scanner(System.in);
    
    public static void value(int number)
    {
        switch (number) {
            case 1:
                System.out.println("You are selected for 1st position");
                break;
            case 2:
             System.out.println("You are selected for 2nd position");
               break;
             case 3:
               System.out.println("You are selected for 3rd position");
               break;
             case 4:
             System.out.println("You are selected for 4th position");
               break;
        
            default:
              System.out.println("getout....!");
                break;
        }
    }
    
         
    public static void main(String[] args) 
    {
        System.out.println(" enter number between 0-3");
        int number = scan.nextInt();
        demoswitch.value(number);
    }

}
    
