package core_java.inheritance.single_inheritance;

public class connection extends arithmetic_operation
{
    public void connect()
    {
        System.out.println("child class method");
    }
    public static void main(String[] args) 
    {
        connection obj = new connection();

        obj.addition();

        
        
    } 
    
}
