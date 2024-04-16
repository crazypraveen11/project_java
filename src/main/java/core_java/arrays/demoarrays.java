package core_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demoarrays 
{
    public static void main(String[] args) 
    {
        String [] cars = {"BMW","AUDI","PORSCHE","FORD"};
        System.out.println(Arrays.toString(cars));

        int [] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));

        // char [] initials = {'A','J','I','T','H'};
        // System.out.println(Arrays.toString(initials));
        
        // String [] ipl_teams = {"CSK","RCB","MI","GT","KKR"};

        // System.out.println(Arrays.toString(ipl_teams));
        // System.out.println(ipl_teams.length);
        // System.out.println(ipl_teams[4]);

        // FOR LOOP
        // for ( int i = 0 ; i < ipl_teams.length ; i++ )
        // {
        //     System.out.println(ipl_teams[i]);
        // }
          
        // FOR EACH
        // for ( String newteams : ipl_teams )
        // {
        //     System.out.println(newteams);
        // }

        // char [] initials = new char[7];

        // initials[0] = 'P';
        // initials[2] = 'A';
        // initials[4] = 'E';
        // initials[6] = 'N';

        // System.out.println(Arrays.toString(initials));

        // for ( int i = 0 ; i < initials.length ; i++)
        // {
        //     Scanner scan = new Scanner(System.in);
        //     System.out.println("Please enter any alphabet values");
        //     char initials1 = scan.next().charAt(0);

        //     initials[i] = initials1;
        // }
        // System.out.println(Arrays.toString(initials));
    }
}