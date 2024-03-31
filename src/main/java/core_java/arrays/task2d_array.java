package core_java.arrays;

public class task2d_array 
{
    public static void main(String[] args) 
    {
        int [] [] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };

        for(int row = 0; row < 3; row++)
        {
            for(int column = 0; column < 3; column++)
            {
                System.out.print((matrix[row][column] + " ") );
            }
        } 
        System.out.println();
        
        for(int values[] : matrix)
        {
            for(int newvalues : values)
            {
                System.out.print( newvalues + " ");
            }
        }
        
    }
}
