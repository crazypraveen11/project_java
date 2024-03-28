package core_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insert_update_read_delete_arrays 
{
    static Scanner scan = new Scanner(System.in);

    public static void insert_arrays(String place [])
    {
        System.out.println( " Before Insert places \n" + Arrays.toString(place));
        System.out.println("Enter Your index to insert Places \n index value start from 0 to " + (place.length - 1));
        int index = scan.nextInt();

        System.out.println("You selected " + index + " Position place name is " + place[index] );
        System.out.println("Enter your changing Place Name....! ");
        String newplace = scan.next();
        place[index] = newplace;

        System.out.println("After Insert Places are " + Arrays.toString(place) );
    }
    
    public static void main(String[] args) 
    {
         String places [] = {"Ooty","Kodaikanal","Mysore","Karnataka","Goa","Rameshwaram"};

        insert_arrays(places);

        

        
    }
}
