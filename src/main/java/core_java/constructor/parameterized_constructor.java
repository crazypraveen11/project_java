package core_java.constructor;
public class parameterized_constructor 
{
    String empname = "Praveen";
   static int age;
    double mypercentage;

    public parameterized_constructor(String empname,int age,double percentage)
    {
        System.out.println("--- Company Details ----");
        this.age = age;
        mypercentage = percentage;
    }
    public parameterized_constructor ()
    {
        System.out.println("HII WELCOME TO OUR COMPANY...!");
    }
    public static void main(String[] args) 
    {
        parameterized_constructor obj1 = new parameterized_constructor();
        parameterized_constructor obj = new parameterized_constructor(obj1.empname,23,98.5);

        
        System.out.println("Employee name is " + obj.empname );
        System.out.println("Age is " + age  );
        System.out.println("Percentage is " + obj.mypercentage );   
    }   
}