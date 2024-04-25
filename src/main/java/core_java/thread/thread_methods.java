package core_java.Thread;

public class thread_methods 
{
   static demo_thread_function demo = new demo_thread_function();
    public static void main(String[] args) 
    {
        Thread th1 = new Thread() 
        {
            public void run()
            {
                demo.list();
            }
        };
        th1.setName("First Thread");
        th1.setPriority(10);
        th1.start();

        Thread th2 = new Thread()
        {
            public void run()
            {
                demo.list();
            }
        };
        th2.setName("Second Thread");
        th2.setPriority(1);
        th2.start();
    }
}


class demo_thread_function
{
    String [] ipl_teams = {"CSK","MI","KKR","SRH"};

    synchronized public void list()
    {
        System.out.println("\nCurrent ID : " + Thread.currentThread().getId() );
        System.out.println("Current Thread name : " + Thread.currentThread().getName());
        System.out.println("Current Thread Priority : " + Thread.currentThread().getPriority());

        for(String ipl : ipl_teams)
     {
        System.out.println(ipl);
     }
    }
}
