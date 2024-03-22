package core_java.loopingstatement;

import java.util.Scanner;

public class forlooptask 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int customer_count = 1;
        for ( ; customer_count<=5 ;customer_count++ )
        {
        System.out.println(" \n Customer no : " +customer_count);
        System.out.println("What mobile brand do you want sir/mam");
        System.out.println("Available Mobile Brands are VIVO, REALME, REDMI, OPPO, Iphone ");
        String brand = scan.next();
        System.out.println("Price Starting from 15000 to 100000");
        System.out.println(" VIVO Price from 15000 to 20000");
        System.out.println(" REALME Price from 20000 to 30000");
        System.out.println(" Redmi Price from 30000 to 50000");
        System.out.println(" OPPO Price from 50000 to 80000");
        System.out.println(" Iphone Price from 80000 to 100000");
        System.out.println("What Mobile Brand Price you should have to choose");
        int price = scan.nextInt();
        
        

        if (brand.equalsIgnoreCase("VIVO")) 
        {
            System.out.println("In VIVO we have VIVO V20, Y51A models...!");
            
            if ((price > 15000) && (price <= 20000)) 
              {
                System.out.println("In this price variant we have VIVO V20, VIVO Y51A models...!");
                System.out.println("Enter your Model from the above");
                String model = scan.next();
                switch (model) {
                  case "VIVO V20":
                    System.out.println("This model price is 20000");
                  break;
                  case "VIVO Y51A":
                    System.out.println("This model price is 18000");
                  break;
                  default:
                    System.out.println("No other models....!");
                }
              }              
            else
            {
                System.out.println("Please select the correct prices variant");
            }
                
        }
            else if (brand.equalsIgnoreCase("REALME")) 
            {
                System.out.println("In REALME we have Realme 11 5G, Realme 8 pro, Realme 6 models...!");  
                if ((price > 20000) && (price <= 30000 ) ) 
              {
                System.out.println("In this price variant we have Realme 12 pro 5G, Redmi Note 13 pro 5G models...!");
              } 
              else
              {
                System.out.println(" In this Price variant do not have Mobile Brands...!");
              }
            }
            else if (brand.equalsIgnoreCase("REDMI")) 
            {
                System.out.println("In REDMI we have Redmi note 10 pro, Redmi note 10s  models...!");   
                if ((price > 30000) && (price <= 50000 )) 
              {
                 System.out.println("In this price variant we have Redmi note 10 Pro 5G, Redmi note 11 models...!");
              }
              else
              {
                System.out.println(" In this Price variant do not have Mobile Brands...!");
              }
            }
            else if (brand.equalsIgnoreCase("OPPO")) 
            {
                System.out.println("In OPPO we have OPPO Reno 11 5G, OPPO Reno 10  models...!"); 
                if ((price > 50000) && (price <= 80000 )) 
              {
                System.out.println("In this price variant we have OPPO Reno 11 5G , OPPO Reno 10 models...!");
              }  
              else
              {
                System.out.println(" In this Price variant do not have Mobile Brands...!");
              }
            }
            else if (brand.equalsIgnoreCase("IPHONE")) 
            {
                System.out.println("In IPHONE we have Iphone 15 pro max, Iphone 13 Mini  models...!"); 
                if ((price > 80000) && (price <= 100000 )) 
              {
                System.out.println("In this price variant we have Apple Iphone 13 mini,Iphone 15 pro max  models...!");
              }  
              else
              {
                System.out.println(" In this Price variant do not have Mobile Brands...!");
              }
            }
        else 
        {
            System.out.println("Please choose the correct Mobile Brand");
        }
      }
    }
}
