package core_java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class secure_read 
{
    public static void main(String[] args) throws IOException
    {
        File locate = new File("E:\\Files\\securewrite.txt");
        
        FileInputStream fis = new FileInputStream(locate);

        InflaterInputStream iis = new InflaterInputStream(fis);

        int size = fis.available();

        byte[] content = new byte[size];

        iis.read(content);

        String bytetostring = new String(content);

        System.out.println( "Secured content are : \n "  + bytetostring);

        iis.close();
        fis.close();


    }
    
}
