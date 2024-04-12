package core_java.polymorphism.overloading.method_overloading;

public class overloading 
{
    public void test1(String name)
    {
       System.out.println( "Name is " + name);
    }

    public void test1(int age)
    {
        System.out.println( "age is " + age);
    }

    public void test1( long mobile )
    {
        System.out.println( "Mobile number is " + mobile);
    }

    public void test1( float height)
    {
        System.out.println( "Your height is " + height);
    }

    public static void main(String[] args) 
    {
        overloading obj = new overloading();

        obj.test1("Praveen");
        obj.test1(21);
        obj.test1(145f);
        obj.test1(6379873794l);
        
    }

    
}