package core_java.polymorphism.overloading.method_overriding;

public class process 
{
    public static void main(String[] args) {
        
        parent obj = new parent();
        obj.scooty();

        parent obj1 = new child();
        obj1.scooty();

        // child obj2 = new daughter();
        // obj2.scooty(); 
    }   
}
