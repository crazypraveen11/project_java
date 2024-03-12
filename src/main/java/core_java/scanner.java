package core_java;

import java.util.Scanner;

public class scanner {

    

    public static void main(String[] args) {
        
        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter Your Id");
        int id = obj1.nextInt();

        System.out.println("Enter Your Name");
        String name = obj1.next();

        System.out.println("Enter your Age");
        short age = obj1.nextShort();

        System.out.println("Enter Your Email Id");
        String email = obj1.next();

        System.out.println("Enter Your Aadhaar number");
        long aadhaar = obj1.nextLong();

        System.out.println("Enter Your Phone number");
        long phone = obj1.nextLong();

        System.out.println("Enter Your Height");
        double height = obj1.nextDouble();

        System.out.println("Enter Your Weight");
        double weight = obj1.nextDouble();

        System.out.println("Enter Your BloodGroup");
        char bloodgroup = obj1.next().charAt(0);

        System.out.println("------ Your Details -------");
        System.out.println(" Your Id is : " + id + " \n Your Name is : " + name + "\n Your Age is : " + age + "\n Your Email id is : " + email + "\n Your Aadhaar number is : " + aadhaar + 
        "\n Your Phone number is : " + phone + "\n Your Height is : " + height + "cm" + "\n Your Weight is : " + weight + "Kg" + "\n Your Blood Group is : " + bloodgroup + " + ve");
    }
    
   static 
   {
    System.out.println("------- Fill Your Details -------");
   }
}
