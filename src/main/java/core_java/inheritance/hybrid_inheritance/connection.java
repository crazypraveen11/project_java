package core_java.inheritance.hybrid_inheritance;

public class connection extends chocolate_shop implements bike,car
{
    public void bike1()
    {
        System.out.println("We have a new model Bikes...!");
    }

    public void car1()
    {
        System.out.println("We have a new Model of Cars...!");
    }

    public static void main(String[] args) {
        
        connection obj = new connection();
        System.out.println("\t <<<< In DMART >>>>");
        obj.bakery1();
        obj.medical();
        obj.chocolates();
        System.out.println("\t <<<< In Bike and Car Showrooms >>>>");
        obj.bike1();
        obj.car1();
    }
    
}
