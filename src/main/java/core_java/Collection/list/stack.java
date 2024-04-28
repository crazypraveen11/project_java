package core_java.Collection.list;

import java.util.Stack;

public class stack 
{
    public static void main(String[] args) 
    {
        Stack <Integer> check = new Stack<>(); // non-generic

        // 5 Methods ( First In Last Out )
        /* 
         * Push ---> add to the last index
         * Pop ---> delete the last element
         * Empty ----> it will check it is empty
         * Peek  -----> top position
         * Search ----> It search the element 
         */

         check.push(21);
         check.push(22);
         check.push(23);
         check.push(24);
         check.push(25);

         System.out.println(check); // output: [21, 22, 23, 24, 25]

         check.pop(); // remove last element
         check.pop();

         System.out.println(check);

         System.out.println(check.peek()); // 23
         System.out.println(check.empty()); // False -> not empty
         System.out.println(check.search(21)); // [21,22,23] ---> it gives output 3 from the last

    }
    
}
