package core_java.arrays;

import java.util.Scanner;

public class task_twod_array 
{
    public static void main(String[] args) 
    {

        int [] [] matrix = new int[4][4];

        Scanner scan = new Scanner(System.in);


        for( int row = 0; row < 4; row++)
        {
            for( int column = 0; column < 4; column++)
            {
                System.out.println("Enter Your Values Row " + row + " Column " + column );
                matrix [row] [column] = scan.nextInt();
            }
        }

        for( int values[] : matrix )
        {
            for( int newvalue: values )
            {
                System.out.print(newvalue + " ");
            }
            System.out.println();
        }
        
    }  
}