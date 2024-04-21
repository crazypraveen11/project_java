package core_java.Exceptions;

public class example_throwexception 
{
    public void access() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException ne) {
            System.out.println(" method try block executed...!");
            throw ne;
        }
    }

    public static void main(String[] args) {
          example_throwexception th = new example_throwexception();

        try {
            th.access();
        } catch (NullPointerException npe) {
            System.out.println("main method catch block executed..!");

        } finally {
            System.out.println("thankyou");
        }

    }
    
}
