package core_java.constructor;

import java.util.Arrays;

public class spiral_notation_task 
{
    public static void main(String[] args) 
    {

        int matrix[] [] = { {1,2,3}, {4,5,6}, {7,8,9}}; 

        //    0 1 2
        // 0  1 2 3
        // 1  4 5 6
        // 2  7 8 9

        // output [ 5,6,9,8,7,4,1,2,3]

        int [] result = new int[9];
        int index = 0;
        int row = 1;
        int column = 1;

        for( ; column <= 2; column++)
        {
            result[index] = matrix[row][column];
            index++;
            // result[0]= matrix[1][1] o/p: 5
            // result[1]= matrix[1][2] o/p: 6
            // result [2] = matrix [1] [3] false
        }

        // in this column value is 3

        column--; // assign value 3 to 2
        row++;   // value can be change to 1 to 2

        for( ; column >= 0 ; column--)
        {
            result[index] = matrix[row][column];
            index++;
            //  result [2] = matrix[2][2] o/p: 9
            //  result [3] = matrix[2][1] o/p: 8
            //  result [4] = matrix[2][0] o/p: 7
            //  result [5] = matrix[2][-1]  false
        }

        // in this column value is -1 we have to increment to 0

        column++; //0
        row --; // change 2 to 1

        for( ; row >=0 ; row--)
        {
            result[index] = matrix[row][column];
            index++;
            // result [5] = matrix[1][0] o/p: 4
            //  result [6] = matrix[0][0] o/p: 1
            //  result [7] = matrix[-1][0]  false
        }

        row++; // -1 to 0
        column ++; // 1

        for( ; column <= 2; column++ )
        {
            result[index] = matrix[row][column];
            index++;
            // result [7] = matrix[0][1] o/p: 2
            //  result [8] = matrix[0][2] o/p: 3
        }


        System.out.println(Arrays.toString(result));



        
    }
    
}
