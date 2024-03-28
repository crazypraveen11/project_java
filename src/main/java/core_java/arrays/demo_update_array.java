package core_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo_update_array 
{

    public static void main(String[] args) 
    {
        String teams [] = {"Praveen","Ajith","Ashwin","Tamil","Chandru"};

        teams[3] = "Tamilselvan";

        System.out.println(" Before updated Team list " + Arrays.toString(teams));

        Scanner scan = new Scanner(System.in);

        System.out.println(" Which index of name can you change...! \n index is start from 0 -" + (teams.length - 1));
        int index = scan.nextInt();

        System.out.println("You selected " + index + " position value is " + teams[index]);

        System.out.println("Please enter your new name....!");
        String newname = scan.next();

        teams [index] = newname;

        System.out.println("After Updated Team list " + Arrays.toString(teams) );
    }    
}
