package core_java.Exceptions.workout;

import java.io.IOException;

public class compiletime_exception 
{
    public static void main(String[] args) throws IOException,InterruptedException
    {
        // Runtime run = new Runtime(); ----> normal constructor cannot be execute it can execute in one method ---> getRuntime();
       
        Runtime run = Runtime.getRuntime();

        Process get;

        get = run.exec("notepad");

        Thread.sleep(3000);

        get = run.exec("settings");
        
    }

    
}