package core_java.Collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class hashset 
{
    public static void main(String[] args) 
    {
        //set
        /*
          no duplicates allowed
          Random order
         * Types Hashset,Treeset
         * Hashset ---> ( Allow null object )
         */
        HashSet obj = new HashSet<>();

        obj.add("Praveen");
        obj.add("Praveen");
        obj.add(21);
        obj.add(21);
        obj.add(" ");
        // duplicates not allowed
        System.out.println("Values " + obj);

        Iterator it = obj.iterator();

        while (it.hasNext()) 
        {
         System.out.println(it.next());
        }

    }
    
}
