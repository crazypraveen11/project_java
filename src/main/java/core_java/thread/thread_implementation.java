package core_java.thread;

public class thread_implementation 
{
    public static void main(String[] args) throws InterruptedException 
    {
        thread1 th1 = new thread1();
        th1.start();
        th1.join();

        thread2 th2 = new thread2();
        Thread multi = new Thread(th2);
        multi.start();
        multi.join();

        System.out.println("HII Welcome.....!");    

    }  
}

class thread1 extends Thread
{
    public void run()
    {
        for(int a = 5; a >= 0 ; a--)
        {
            System.out.println(a);
        }
    }
}

class thread2 implements Runnable
{
    public void run()
    {
        int a = 5;

        for(int i = 1; i <= 5; i++ )
        {
            System.out.println(a +" * "+i+" = " + a*i );
        }
    }
}
