package core_java;

public class variables
{
    // static variable
    static int a = 10; 
    // runs in main method or user defined method

    // creating a user defined static method
    public static void task1()
    {
        String Employeename = "Ajithkumar";
        System.out.println( "First Employee name is: " +Employeename);
        System.out.println("Attenance : " +a);
    }

    public static String task2()
    {
        System.out.println("Second Employee name is ");
        return "Praveen";
    }

    public static void main(String[] args) {
        
        // instance variable
        String companyname = "Wipro";
        System.out.println("My Company Name is " +companyname);

        // static variable compile
        System.out.println("Total count is : " + a);

        // static method compile in main method cannot need any object to run
        task1();
        task2();
    }

    static
    {
        System.out.println("------Company Details-------");
    }

}
