package core_java.Exceptions;
import java.io.IOException;
public class compiletime_exception 
{
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run = Runtime.getRuntime();

        Process pro;

        pro = run.exec("notepad");

        Thread.sleep(5000);

        pro = run.exec("mspaint");

    }
    
}
