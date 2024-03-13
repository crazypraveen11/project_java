package core_java;

public class methods {
    
    public int Myinput()
    {
        return 100;
    }
    public static void main(String[] args) 
    {                                                       
        methods obj1 = new methods();
        int no = obj1.Myinput();

        char name = (char) no;
        System.out.println(name);
    }
}
