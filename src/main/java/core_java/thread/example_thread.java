package core_java.Thread;

public class example_thread 
{
    public static void main(String[] args) throws InterruptedException
    {
        // demo_thread1 th1 = new demo_thread1(); // This is for demothread1 class object creation

        // // th1.run();  // This is normally we calling it is not a thread implementation of calling
        // th1.start();
        
        

        // demo_thread1 th4 = new demo_thread1();
        // th4.start();
        
       

        demo_thread2 th2 = new demo_thread2();
        Thread process = new Thread(th2);

        process.start();

        demo_thread2 th3 = new demo_thread2();
        Thread process1 = new Thread(th3);
        process1.start();
        

        System.out.println("Main function thread is executed...!");
    } 
}


class demo_thread1 extends Thread
{
   synchronized public void run()
    {
        for(int a = 5; a >= 0 ; a--)
        {
            System.out.println(a);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                
            }
        }
    }
}

class demo_thread2 implements Runnable
{
   synchronized public void run()
    {
        int a = 5;

        for(int i = 1; i <= 5; i++ )
        {
            System.out.println(a +" * "+i+" = " + a*i );
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                
            }
        }
    }
}