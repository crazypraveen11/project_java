package core_java.Thread;

public class synckey 
{
    public static void main(String[] args) 
    {
       final table1 table1 = new table1();

       Thread th1 = new Thread()
       {
          public void run()
          {
            table1.table(2);
          }
       }; 
       th1.start();

       Thread th2 = new Thread()
       {
          public void run()
          {
            table1.table(3);
          }
       };
       th2.start();
    } 
}

class table1
{
   synchronized public void table(int i)
    {
        for(int j=1; j<=5 ; j++)
        {
            System.out.println(i + " X " + j + " = " + (i*j));
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ie)
            {
            }
        }
    }
}