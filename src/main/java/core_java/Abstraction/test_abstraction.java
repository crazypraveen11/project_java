package core_java.Abstraction;

public class test_abstraction extends demo_implementation
{

    public void scooty()
    {
        System.out.println("Access125");
    }

    public static void main(String[] args) 
    {
        demo_implementation obj = new test_abstraction();

        obj.scooty();

        String name = obj.employee_name();
        System.out.println(name);
        
    }
}
