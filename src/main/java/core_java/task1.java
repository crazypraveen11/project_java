package core_java;

import java.util.Scanner;

public class task1 {
    
    public String Mymethod(int a,float weight)
    {
        float b = a;
        int c = (int) weight;
        System.out.println(b +"\n"+ c);
        return "Praveen";
    }

    public void demovalues(int value,float decimal,long phone, char initial)
    {
        System.out.println("\n" + value + "\n" + decimal + "\n" + phone + "\n" + initial );
    }

    public static void main(String[] args) {
        // mymethod
        task1 scan = new task1();
        String name = scan.Mymethod(100, 67.8f);
        System.out.println(name);

        // demovalues
        task1 get = new task1();

         Scanner getting = new Scanner(System.in);

         System.out.println("Enter your Id");
         int value = getting.nextInt();

         System.out.println("Enter your height");
         float decimal = getting.nextFloat();

         System.out.println("Enter your Phonenumber");
         long phone = getting.nextLong();

         System.out.println("Enter your initial");
         char initial = getting.next().charAt(0);

        get.demovalues(value , decimal , phone , initial);
    }
}
