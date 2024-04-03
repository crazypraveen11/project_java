package core_java.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class insert_update_list_read_arrays 
{

    static Scanner scan = new Scanner(System.in);

    public static void insert_arrays(String place [])
    {
      System.out.println("You have to enter your 9 favorite place names");
       for( int i = 0 ; i < place.length ; i++ )
         {
            
            System.out.println(" Enter Your " +  i  +  " Place Name");
            String placename = scan.next();

            place [i] = placename;
         }
    }

    public static void update_arrays(String place [])
    {
        System.out.println("Select a index value to change it to new place \n Index value start from 0 to " + (place.length - 1));
        int indexvalue = scan.nextInt();
        System.out.println("You selected " + indexvalue + " position placename is " +place[indexvalue] );

        System.out.println("Enter Your New Place to update in it....!");
        String newplace = scan.next();

        place [indexvalue] = newplace;

        System.out.println("After Update your Places are " + Arrays.toString(place));
    }

    public static void read_arrays (String place[])
    {
        System.out.println("\n Which position you want to select 0 to " + (place.length - 1) );
        int index = scan.nextInt();

        System.out.println(index + "-Position place name is " + (place[index]) );
    }
    
    public static void list_arrays (String place[])
    {
        System.out.println("------ Places ------ \n Your Favorite Places are ");
        for( String newplaces : place )
        {
            System.out.println( newplaces);
        }
    }

    public static void main(String[] args) 
    {
         String fav_places [] = new String[10];

        do
        {
          System.out.println(" \n Which Process you want to execute \n 1)Insert \n 2)Update \n 3)Read \n 4)List");
          int process = scan.nextInt();

         switch (process) {
            case 1:
              insert_arrays(fav_places);
              System.out.println("Places Inserted Successfully...!");
              System.out.println("Your Places are " + Arrays.toString(fav_places) );
                break;
            case 2:
              update_arrays(fav_places);
              System.out.println("Places Updated Successfully...!");
              break;
            case 3:
              read_arrays(fav_places);
              break;
            case 4:
              list_arrays(fav_places);
              break;
            default:
             System.out.println("Please enter the correct number");
              break;
         }
        } 
        while(true);  
    }
}