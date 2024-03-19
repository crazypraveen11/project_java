package core_java;


public class operators 
{
    public static void main(String[] args) 
    {
        //Arithmetic operator +,-,*,/,%
        int tamil_mark = 95;
        int english_mark = 90;
        int maths_mark = 85;
        int science_mark = 89;

        System.out.println("My total mark is " + (tamil_mark + english_mark + maths_mark + science_mark) );

        //Assignment operator +=,-=,*=,/=,%=
        tamil_mark -= 5;
        System.out.println("My assigned Tamil mark is " +tamil_mark);

        //Relational or comparison operator >,<,<=,>=,==,!=

        int a = 5;
        int b = 5;

        System.out.println("a>b is " + (a>b)); //true   (5>5) same value false
        System.out.println("a<b is " + (a<b)); //false   (5<5) same value false
        System.out.println("a<=b is " + (a<=b)); // false  (5<=5) same value true
        System.out.println("a>=b is " + (a>=b)); // true  (5>=5) same value true
        System.out.println("a==b is " + (a==b)); // false   (5==5) true
        System.out.println("a!=b is " + (a!=b)); //(10!=5) true  (5!=5) false

        // Logical operator &&,||,!
        System.out.println( "Logical AND is " + ((69==68) && (69==68)) ); // T T ---> T
        System.out.println( "Logical OR is " + ((69==69) || (69==69)) ); // F F --> F
        System.out.println( "Logical NOT is " + ( ! (69==69)) ); // T --> F,   F ---->T

        //Bitwise operator &,|,^,~  AND,OR,XOR,Complement ( calculation 1 -> T , 0 -> F )
         int c = 88;
         int d = 111;

         System.out.println("Bitwise AND (c & d) is " + (c & d) );//  ( Bitwise AND ----->  & )  ( T T ---> T)
         System.out.println("Bitwise OR (c | d) is " + (c | d) );//  ( Inclusive OR ---->  | )  (   F F -- > F  )
         System.out.println("Bitwise XOR (c ^ d) is " + (c ^ d) );// ( Exclusive OR  ----->  ^ ) ( T T ---> F  F  F --->F)

         int e = 8;
         System.out.println("Bitwise complement ~e is " + ~ e ); // it can assign given value by plus 1 and return in negative

         //Unary operator ( increment, Decrement )
         int x = 100;

         System.out.println("Pre increment value is " + (++x)); //101
         System.out.println("Post increment value is " + (x++)); //101 it will return in nextline
         System.out.println(x); //102

         //shift operator (left shift, right shift )

         int ab = 5;
         int ba = 2;

         System.out.println("right shift value is " + (ab >> ba)); // a / 2 ^ b  -----> 1
         System.out.println("left shift value is " + (ab << ba)); // a * 2 ^ b  ------> 20


    }

    
}