package core_java.inheritance.multilevel_inheritance;

public class connect_student extends class_advisor
{
    public static void main(String[] args) 
    {
        connect_student obj = new connect_student();

        System.out.println("Student in KSR ");
        obj.management();
        obj.Hod();
        obj.class_advisor();
        
    }
    
}
