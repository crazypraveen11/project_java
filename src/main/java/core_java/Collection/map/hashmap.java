package core_java.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class hashmap 
{
    public static void main(String[] args) 
    {
        HashMap <String, Integer> obj = new HashMap<>();

        obj.put("Praveen", 21);
        obj.put("Ashwin", 21);
        obj.put("Ajith", 20);
        obj.put("Kumar", 25);

        System.out.println(obj);
        
        for(Map.Entry object : obj.entrySet())
        {
            System.out.println("Name : " + object.getKey() + "\t Age : " + object.getValue());
        }
    } 
}