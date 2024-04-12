package core_java.workout;

import java.util.Arrays;

public class twodimension 
{
    public static void main(String[] args) {
        int matrix [][] = { {0,1,2}, {2,4,6}};

    int row = 0;
    int column = 1;
    int index = 0;

    int single[] = new int[6];

    for( ; column<=2; column++)
    {
        single[index]=matrix[row][column];
        index++;
    }

    row++;
    column--;

    for( ; column>=1; column--)
    {
        single[index]=matrix[row][column];
        index++;
    }

    row--; //0
    for( ; row<=1; row++)
    {
        single[index]=matrix[row][column];
        index++;
    }

   
    
    System.out.println(Arrays.toString(single));
    
    
}
}