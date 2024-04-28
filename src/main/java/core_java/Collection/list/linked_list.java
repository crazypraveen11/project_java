package core_java.Collection.list;

import java.util.LinkedList;

public class linked_list 
{
    public static void main(String[] args) 
    {
        LinkedList link = new LinkedList();  //generic

        //Methods
        /*
         * add / addLast , addFirst , add(index,object)
         * remove / removeFirst, removeLast, remove(index), remove(object)
         * contains() , clear()
         * set(index,object) ---> update
         * getFirst, getLast, get(index)
         * indexOf(object)
         */

        link.add("Praveen");
        link.add(21);
        link.add(6379873794l);
        link.add(291272421125l);
        // link.clear(); // it will delete all the values
        link.add(4, "Fourth value");

        link.removeLast();
        link.removeFirst();
        

        System.out.println(link); // output ---->  [Praveen, 21, 6379873794, 291272421125]
        System.out.println(link.get(0)); // output --> 21
        System.out.println(link.contains(6379873794l)); // true

    }

    
}