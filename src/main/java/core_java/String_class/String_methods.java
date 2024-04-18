package core_java.String_class;

public class String_methods 
{
    public static void main(String[] args) 
    {
        // There are two ways to create String Object >>> Literal & Non-Literal 
        //  Literal 
        String name = "Praveen";
        System.out.println( "First name is" + name);

        //  Non-literal
        String new_name = new String("Senthil");
        System.out.println( "Second name is " + new_name);

        char [] initials = {'B','i','k','e'};
        String init_bike = new String(initials);
        System.out.println(init_bike);

        // 1) Concat () --> It used to Join the two String Words or values
        name.concat(new_name); // Praveensenthil
        System.out.println(name); // Praveen
        System.out.println( "After Using Concat name becomes " + name.concat(new_name)); // Praveensenthil

        // 2) charAt () ------> It can take particular index value
        System.out.println(name.charAt(3));

        // 3) equals() and equalsIgnoreCase() ----> ( True/False )
        System.out.println( "Your name is " + "Praveen".equals(name)); // same ---> True 
        System.out.println("Your name is " + "praveen".equalsIgnoreCase(name));  // same  --> True

        // 4) compareTo() and compareToIgnoreCase ()  ---> It compare by using ASCII values
        System.out.println("Praveen".compareTo(name)); // 0 
        System.out.println("praveen".compareToIgnoreCase(name)); // 0

        // 5) substring() ----> It has Starting and Ending values 
        System.out.println(name.substring(1));
        System.out.println(name.substring(3, 7));

        // 6 ) toLowerCase()  toUpperCase()
        String lower = "BIKE";
        System.out.println( "Lowercase " + lower.toLowerCase()); // bike

        String upper = "bike";
        System.out.println("Uppercase " +upper.toUpperCase()); // BIKE

        // 7) Replace() ---> It replace the specific word or sentence to the given String or values
        String content = "This is a wonderful place it is very famous";
        System.out.println("Original content <<< " + content);
        System.out.println("After replace it becomes <<< " + content.replace("is", "are"));

        // 8) Contains() ---> It checks the words in the given values (True / False )
        String quote = "This is a car";
        System.out.println(quote.contains("car")); // true
        System.out.println(quote.contains("th")); // false

        // 9) startsWith() endsWith() ---> It checks the starting and ending words ( True/ False )
        String place = "It is very nice place";
        System.out.println(place.startsWith("it")); //false
        System.out.println(place.endsWith("ce")); // true

        // 10) trim() -----> removes the gap given by user
        String space = "   This is a place  ";
        System.out.println(space); //   This is a place  --> It give as a gap assigning
        System.out.println(space.trim()); // It removes the gap

        // 11) Split() ----> It can Split and gives as a output
        String usage = "This is a very famous place";
        System.out.println(usage.split(" ")); // It give as a address

        String [] usage1 = usage.split(" ");
        for( String get : usage1)
        {
            System.out.println(get);
        }

        // 12) getBytes() ---> It can give a ASCII values
        byte[] ascivalues = name.getBytes();

        for (byte asci : ascivalues) {
            System.out.println(asci);
        }
    }
}