package core_java.inheritance.hierarchical_inheritance;

public class bakery extends Dmart
{
    public void bakery()
    {
        System.out.println("In bakery all cakes and chocolates are available");
    }
    public static void main(String[] args) 
    {
        bakery obj = new bakery();

        obj.Dmart();
        obj.bakery();
        
    }
    
}
