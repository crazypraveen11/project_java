package core_java;

public class methods 
{
    
    public int Myinput()
    {
        return 100;
    }
    public static void main(String[] args) 
    {                                                       
        methods obj1 = new methods();
        int a = obj1.Myinput();

        char b = (char) a;
        System.out.println(b);
    }
}
