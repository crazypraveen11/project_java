package core_java.inheritance.multiple_inheritance;

public class connect implements scooty,car,bike
{

    public void access125()
    {
        System.out.println("In Scooty we have Access 125");
    }
    
    public void car()
    {
        System.out.println("BMW car");
    }

    public void bike()
    {
        System.out.println("Duke 125");
    }

    public static void main(String[] args) 
    {
        connect obj = new connect();

        obj.access125();
        obj.car();
        obj.bike();
        
    }
}
