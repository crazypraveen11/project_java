package core_java.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.zip.DeflaterOutputStream;

public class secure_write 
{
    public static void main(String[] args) throws IOException
    {
        File locate = new File("E:\\Files\\securewrite.txt");

        // locate.createNewFile();

        FileOutputStream fos = new FileOutputStream(locate);

        DeflaterOutputStream dos = new DeflaterOutputStream(fos);

        String content = "Hii welcome to our showroom";

        dos.write(content.getBytes());

        System.out.println(locate.getName() + " has been written successfully");

        dos.close();
        fos.close();
    }
    
}
