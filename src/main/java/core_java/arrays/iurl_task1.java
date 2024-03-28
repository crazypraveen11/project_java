package core_java.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class iurl_task1 
{

    static Scanner scan = new Scanner(System.in);

    public static void insert_arrays(String place [])
    {
        System.out.println("Enter a index value to insert a place name \n index value starts from 0 to " + (place.length - 1) );  
        int num = scan.nextInt();
        System.out.println("You selected " + num + "-position placename is " +place[num] );

        System.out.println("Enter Your New Place to update in it....!");
        String newplace = scan.next();

        place [num] = newplace;

        System.out.println("After Update your Places are " + Arrays.toString(place));
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

         for( int i = 0 ; i < fav_places.length ; i++ )
         {
            System.out.println("Enter Your Place Name");
            String placename = scan.next();

            fav_places [i] = placename;
         }
         System.out.println("Your Places are " + (Arrays.toString(fav_places)) );
         System.out.println("Which Process you want to execute \n 1)Insert 2)Update 3)Read 4)List 5)Delete ");
         int process = scan.nextInt();

         switch (process) {
            case 1:
              insert_arrays(fav_places);
                break;
            case 2:
              update_arrays(fav_places);
              break;
            case 3:
              read_arrays(fav_places);
              break;
            case 4:
              list_arrays(fav_places);
              break;
            case 5:
              
              break;
         
            default:
             System.out.println("Please enter the correct number");
                break;
         }   
    }
}
