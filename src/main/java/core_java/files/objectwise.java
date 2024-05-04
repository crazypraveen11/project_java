package core_java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objectwise 
{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        File locate = new File("E:\\Files\\objectofmobile.txt");

        // locate.createNewFile();

        // System.out.println(locate.getName() + " has been created successfully");

        // FileOutputStream fos = new FileOutputStream(locate);

        // ObjectOutputStream oos = new ObjectOutputStream(fos);

        // objectwise_implementation mob = new objectwise_implementation("VIVO", "Y51A", 28000, 8);

        // oos.writeObject(mob);

        // oos.close();
        // fos.close();

        FileInputStream fis = new FileInputStream(locate);

        ObjectInputStream ois = new ObjectInputStream(fis);

        objectwise_implementation obj = (objectwise_implementation)ois.readObject();

        System.out.println("MObile Brand : " + obj.mobile_brand);
        System.out.println("Mobile Model : " + obj.mobile_model);
        System.out.println("Mobile price : " + obj.mobile_price);
        System.out.println("Mobile RAM : " + obj.mobile_ram);

        ois.close();
        fis.close();  
    } 
}