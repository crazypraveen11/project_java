package core_java.constructor;

import java.util.Scanner;

public class jagged_array 
{
    public static void main(String[] args) 
    {
        // compile time 

    //    int [] [] demo = { {1,2,3}, {4,5,6,7}, {12,13,14,15,16,123,112}};

    //    for(int demo1 [] : demo)
    //    {
    //      for( int demo2 : demo1 )
    //      {
    //         System.out.print( demo2 + " " );
    //      }
    //      System.out.println();
    //    }  
        
    //    run time

     
     
     String [] [] hospital_details = new String[2][];

     hospital_details[0] = new String[3];
     hospital_details[1] = new String[4];


    for(int floor = 0; floor < hospital_details.length; floor++)
    {
        for( int room =0; room < hospital_details[floor].length; room++ )
        {
            System.out.println("-------Lotus Eye Hospital----");
            Scanner scan = new Scanner(System.in);
            System.out.println("Floor no " + floor + " Room no " + (room + 1));
            hospital_details[floor][room] = scan.next();
        }
    }

    for(String patient1[] : hospital_details)
   {
      for( String patient2 : patient1 )
      {
        System.out.print(patient2 + " ");
      }
      System.out.println();
   }
    }
}
