package core_java.constructor;

public class default_constructor 
{
    public static void sample()
    {
        System.out.println("HI SAMPLE");
    }
    // Default Constructor
    public  default_constructor()
    {
        System.out.println("HII WELCOME TO OUR COMPANY");
    }
    public static void main(String[] args) 
    {
        // In Default Constructor we have to create object it automatically run
        default_constructor obj = new default_constructor();
        
        sample();
    }  
}