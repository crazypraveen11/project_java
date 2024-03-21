package core_java.loopingstatement;

import java.util.Scanner;

public class forloop 
{
    static Scanner scan = new Scanner(System.in);

    public static void time()
    {
       
         int student_count = 1;

        for( ; student_count<=5 ; student_count++ )
        {
            System.out.println("Student count no : " +student_count);
            System.out.println("Enter your Session time");
            float timing = scan.nextFloat();

            if ( (timing >= 8.00) && (timing <= 9.00) ) 
        {
            System.out.println("Your class period is TAMIL ");
        }
        else if ((timing >9.00) && (timing <= 10.00)) {
            System.out.println("Your class period is ENGLISH");
        }
        else if ((timing >10.00) && (timing <= 11.00)) 
        {
            System.out.println("Your class period is MATHS");
        }
        else if ((timing >11.00) && (timing <= 12.00)) 
        {
            System.out.println("Your class period is BOTANY");
        }
        else if ((timing >12.00) && (timing <= 1.00)) 
        {
            System.out.println("Your class period is ZOOLOGY");
        }
        else
        {
            System.out.println("You have No class");
        }
        }

    }
    public static void main(String[] args) 
    {
        time();
    }
}
