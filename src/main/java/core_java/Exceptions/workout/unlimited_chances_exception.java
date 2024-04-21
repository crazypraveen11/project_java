package core_java.Exceptions.workout;
import java.util.Scanner;

public class unlimited_chances_exception 
{
    static Scanner scan = new Scanner(System.in);
    public static void unlimited(String content)
    {
        try
        {
        System.out.println("Enter your Starting Index");
        int start = scan.nextInt();
        System.out.println("Enter your Ending Index");
        int end = scan.nextInt();
        System.out.println(content.substring(start, end));
        }
        catch(StringIndexOutOfBoundsException si)
        {
            System.out.println("Please choose the index from this values");
            System.out.println("Starting index is 0 and ending index is " + content.length());
            unlimited(content);
        }
    }

    public static void limited(String content, int chances)
    {
        try
        {
        System.out.println("Enter your Starting Index");
        int start = scan.nextInt();
        System.out.println("Enter your Ending Index");
        int end = scan.nextInt();
        System.out.println(content.substring(start, end));
        }
        catch(StringIndexOutOfBoundsException si)
        {
            System.out.println("Please choose the index from this values");
            System.out.println("Starting index is 0 and ending index is " + content.length());
            if(chances < 3)
            {
                chances++;
                limited(content, chances);
            }
            else
            {
                System.out.println("Max attempt is used...!");
            }
        }

    }
    public static void main(String[] args) 
    {
        String content = "Nature is an inherent character or constitution, particularly of the ecosphere or the universe as a whole. In this general sense nature refers to the laws, elements and phenomena of the physical";
        // unlimited(content);
        limited(content, 1);

    }

    
}