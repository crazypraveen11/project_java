package core_java.arrays;

import java.util.Scanner;

public class demo_read_arrays 
{
    public static void passing_arrays(float percentage[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which position of percentage you want from 0 - 5 ...!");

        int position = scan.nextInt();
        System.out.println(position + " position value is : " + percentage[position] );
    }
    
    public static void main(String[] args) 
    {
        float CGPA[] = { 70.0f, 80.0f, 85.0f,90.0f, 95.0f, 98.0f };

        passing_arrays(CGPA);
        
    }
}
