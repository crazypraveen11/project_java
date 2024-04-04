package core_java.inheritance.hierarchical_inheritance;

public class medical_shop  extends Dmart
{

    public void medical_shop()
    {
        System.out.println("Medical Shop all Tablets are available");
    }

    public static void main(String[] args) 
    {
        medical_shop obj = new medical_shop();

        obj.Dmart();
        obj.medical_shop(); 
    }   
}
