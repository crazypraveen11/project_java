package core_java.Collection.list;

import java.util.ArrayList;
import java.util.Vector;

public class arraylist_and_vector 
{
    public static void main(String[] args) 
    {
        // Array and vector can exchange the values with eachother
        //In arrayList Synchronized not support so it is fast performance

        // ( Vector ) 
        // Synchronized is supported

        // Methods
        /*
         * add, addAll, add(index,object)
         * remove(index), remove(object)
         * contains
         * get(index)
         * set(index,object)--> update
         * indexOf(object)
         * 
         * removeAll ----> only remove original values
         * retainAll ----> only remove duplicate values
         */

        ArrayList obj = new ArrayList<>(); //generic

        obj.add("Praveen");
        obj.add(21);
        obj.add(6379873794l);
        obj.add("29 Jan");
        obj.add("CS");

        System.out.println(obj);

        Vector obj1 = new Vector<>();

        obj1.add("Ashwin");
        obj1.add(21);
        obj1.add(6380590269l);
        obj1.add("15 Aug");
        obj1.add("CS");

        System.out.println(obj1);

        obj1.removeAll(obj);
        System.out.println(obj1); // output [Ashwin, 6380590269, 15 Aug] same value deleted and duplicated value getted

        // obj1.retainAll(obj);
        // System.out.println(obj1); // output [21, CS] duplicate value removed and same value getted


        
    }
    
}
