package core_java.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class task2d_array 
{
     

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        String[][] iplTeams = new String[rows][columns];

        // Input IPL teams
        System.out.println("Enter the names of IPL teams :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                iplTeams[i][j] = scanner.next();
            }
        }

        // Convert to one-dimensional array
        String[] oneDArray = new String[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = iplTeams[i][j];
            }
        }

        // Print the one-dimensional array
        System.out.print("---- IPL teams ---- \n");
        System.out.println(Arrays.toString(oneDArray));

        
    }
}
