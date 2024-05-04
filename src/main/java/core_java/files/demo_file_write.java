package core_java.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo_file_write 
{
    public static void main(String[] args) throws IOException
    {
        File locate = new File("E:\\Files\\demoread.txt");
        // File write ---> use fileoutputstream
        
        // locate.mkdir(); // this is to create folder

        // locate.createNewFile(); // this is to create a file in a folder
        // System.out.println(locate.getName()+ " File has been created successfully...!");

        FileOutputStream fos = new FileOutputStream(locate);

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter Your content ");

        String content = scan.nextLine();

        fos.write(content.getBytes());

        fos.close(); 
    }
}