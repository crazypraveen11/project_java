package core_java.arrays;


public class two_dimensional_array 
{
    public static void main(String[] args) 
    {
        // datatype [] [] arrayname = { {}, {}, {} }
                                    //   0   1   2
        
        int [] [] matrix = { { 1, 2, 3, 0 }, {4, 5, 6, 11}, {7, 8, 9, 12} };
        //                     0  1  2  3     0  1  2  3     0  1  2   3

        for( int row = 0; row < 3 ; row++ )
        {
            for(int column = 0; column < 4; column++)
            {
                System.out.print(matrix [row][column] + " " );
            }
            System.out.println();
        }

    }

    
}