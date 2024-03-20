package core_java;

import java.util.Scanner;

public class ifstatement
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scan.next();
        System.out.println("Enter your age ");
        short age = scan.nextShort();
        System.out.println("Enter your Bloodgroup");
        char Bloodgroup = scan.next().charAt(0);
        System.out.println("Enter your Political Party");
        String party = scan.next();

        if (name.equalsIgnoreCase("Praveen")) 
        {
            System.out.println("\n You are approved for this Process...! ");
            if (age >= 18) 
            {
              System.out.println(" You are Eligible to Vote");
                if (Bloodgroup == 'o' ) 
                {
                    System.out.println(" You are selected to give Blood"); 
                    if (party.equalsIgnoreCase("DMK")) 
                    {
                       System.out.println(" Your Vote Amount is 1000");
                    }
                        else if (party.equalsIgnoreCase("ADMK")) 
                        {
                            System.out.println("Your Vote Amount is 1500");
                        }
                        else if (party.equalsIgnoreCase("BJP")) 
                        {
                            System.out.println(" Your Vote Amount is 2000");
                        }
                    else  
                    {
                        System.out.println("Your vote amount is 500");  
                    }
                }
                else 
                {
                    System.out.println("You are not selected to give blood");
                }
            }
            else
            {
              System.out.println("Your age is below 18 so you are not eligible to vote");
            }
        }
        else
        {
            System.out.println("You are not approved for this process ");
        } 
    }   
}
