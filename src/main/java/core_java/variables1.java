package core_java;

public class variables1 
{
    int a = 50; //global variable

    public void teddy()
    {
        String name = "Ashwin";  //local variable 
        System.out.println("-------- Student Details --------");
        System.out.println("My Name is " +name);
        System.out.println(a);  //global variable printing in user created method
    }

    public void task()
    {
        String name = "Praveen";   //local variable
        System.out.println("My Name is " +name);
    }
    
    public static void main(String[] args) 
    {
        variables1  obj1 = new variables1(); //object creation
        obj1.teddy(); //local variable printing in main method by calling object
        obj1.task();
        System.out.println(obj1.a); //global variable printing in main method we should call by object
    }
}
