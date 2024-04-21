package core_java.Exceptions.workout;

public class example_throw 
{
    public void myaccess()
    {
        try
        {
            throw new NullPointerException();
        }
        catch(NullPointerException npe)
        {
            System.out.println(npe + " <<< method try block executed..! >>>");
            throw npe;
        }
    }
    public static void main(String[] args) 
    {
        example_throw run = new example_throw();

        try
        {
            run.myaccess();
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne + " <<< main method catch block can be executed...! >>>");
        }
        finally
        {
            System.out.println("Thank You");
        }  
    }
}