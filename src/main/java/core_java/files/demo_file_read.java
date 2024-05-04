package core_java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class demo_file_read 
{
    public static void main(String[] args) throws IOException
    {
        File locate = new File("E:\\Files\\demoread.txt");

        // File read ---> use Fileinputstream
        
        FileInputStream fis = new FileInputStream(locate);

        // System.out.println(fis.available() + " letters"); // 94 letters

        int filesize = fis.available(); // available() ---> It gives the count of the content

        byte [] mycontent = new byte[filesize];

        fis.read(mycontent);

        String bytetostring = new String(mycontent);

        System.out.println(bytetostring);

        fis.close();   
    }   
}