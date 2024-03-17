package core_java;

import java.util.Scanner;

public class task2 {
    
    public String data(int a,float value)
    {
        System.out.println(a +"\n" + value);
        return "Ajith";
    }

    public void datavalue (String Id,float weight,long phone,char letter)
    {
        System.out.println("\n" + "-----Your Details-----");
        System.out.println("\n" + Id + "\n" + weight + "kg" + "\n" + phone + "\n" + letter);
    }

    public static void main(String[] args) {
        
        task2 value = new task2();
        String name = value.data(10,100.5f);
        System.out.println(name);

        task2  get = new task2();
        Scanner  getobj = new Scanner(System.in);

        System.out.println("Enter your Id");
        String Id = getobj.next();

        System.out.println("Enter your weight");
        float weight = getobj.nextFloat();

        System.out.println("Enter your Phonenumber");
        long phone = getobj.nextLong();

        System.out.println("Enter Your Initial");
        char letter = getobj.next().charAt(0);

        get.datavalue(Id, weight, phone, letter);
    }
}
