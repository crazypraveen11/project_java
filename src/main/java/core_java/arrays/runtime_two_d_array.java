package core_java.arrays;

import java.util.Scanner;

public class runtime_two_d_array 
{
    public static void main(String[] args) 
    {

        int [] [] matrix = new int[3][4];

        Scanner scan = new Scanner(System.in);

        // inserted 2d array
        for(int row = 0; row < 3; row++)
        {
            for(int column = 0; column < 4; column++)
            {
                System.out.println("Enter Your Values Row " + row + " Column " + column );
                matrix [row][column] = scan.nextInt();
            }
        }

        // 2d array list using foreach
        for(int [] values : matrix)
        {
            for( int newvalue : values )
            {
                System.out.print(newvalue + " ");
            }
            System.out.println();
        }
    }
}