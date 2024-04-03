package core_java.constructor;

import java.util.Arrays;

public class task2_spiralnotation 
{
    public static void main(String[] args) 
    {                     //         0                 1                 2                 3   
        int [] [] matrix = { {55,45,35,25,15}, {14,24,34,44,54}, {51,41,31,21,11}, {12,22,32,42,52} };
        
        int [] result = new int[20];

        int index = 0;
        int row = 0;
        int column = 3;

        for( ; column <= 4  ; column ++)
        {
            result[index] = matrix[row][column];
            index++;
            // result[0]= matrix[0][3] o/p : 25
            // result[1]= matrix[0][4] o/p : 15
            // result[2]= matrix[0][5] false
        }

        row++; // 0 to 1
        column--; // 5 to 4

        for( ; row <=3  ; row++)
        {
            result[index] = matrix[row][column];
            index++;
            // result [2] = matrix[1][4] o/p: 54
            // result [3] = matrix[2][4] o/p: 11
            // result [4] = matrix[3][4] o/p: 52
            // result [5] = matrix[4][4]  false
        }

        row--; // 4 to 3
        column--; // 4 to 3

        for( ; row >=1 ; row--)
        {
            result[index] = matrix[row][column];
            index++;
            //result[5] = matrix[3][3] o/p : 42
            //result[6] = matrix[2][3] o/p : 21
            //result[7] = matrix[1][3] o/p : 44
            //result[8] = matrix[0][3]  false
        }

        row++; // 0 to 1
        column--; // 3 to 2

        for( ; row<=3 ; row++)
        {
            result[index] = matrix[row][column];
            index++;
            //result[8]= matrix[1][2] o/p: 34
            //result[9]= matrix[2][2] o/p: 31
            //result[10]= matrix[3][2] o/p: 32
            // result [11] = matrix[4][2]  false
        }

        row--; // 4 to 3
        column--; // 2 to 1

        for( ; column>=0  ; column--)
        {
            result[index] = matrix[row][column];
            index++;
            //result[11]= matrix[3][1] o/p: 22
            //result[12]= matrix[3][0] o/p: 12
            //result[13]= matrix[3][-1] false
        }

        row--; // 3 to 2
        column++; // -1 to 0

        for( ; column<=1 ; column++)
        {
            result[index] = matrix[row][column];
            index++;
            //result[13]=matrix[2][0] o/p: 51
            //result[14]=matrix[2][1] o/p: 41
            //result[15]=matrix[2][2]  false
        }

        row--; // 2 to 1
        column--; // 2 to 1

        for( ; column>=0 ; column--)
        {
            result[index] = matrix[row][column];
            index++;
            //result[15]=matrix[1][1] o/p: 24
            //result[16]=matrix[1][0] o/p: 14
            //result[17]=matrix[1][-1] false
        }

        row--; // 1 to 0
        column++; // -1 to 0

        for( ; column<=2 ; column++)
        {
            result[index] = matrix[row][column];
            index++;
            //result [17]= matrix[0][0] o/p: 55
            //result [18]= matrix[0][1] o/p: 45
            //result [19]= matrix[0][2] o/p: 35
        }

        System.out.println(Arrays.toString(result));

    }
}
