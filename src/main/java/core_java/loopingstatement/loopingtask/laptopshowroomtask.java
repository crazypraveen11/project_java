package core_java.loopingstatement.loopingtask;

import java.util.Scanner;

public class laptopshowroomtask 
{
    static Scanner scan = new Scanner(System.in);

    public static void laptopvalues()
    {
        
        for ( int customer_count = 1 ; customer_count <= 3 ; customer_count++ )
        {
            System.out.println("\n Customer no : " + customer_count);
            System.out.println(" Hii sir/mam Welcome to Our HP WORLD SHOWROOM.....!  \n  Which Type of Laptop You Want sir/mam \n  We have Accounts / Gaming / IT-Field type of Laptops ");
            System.out.println("Enter Your Field Type");
            String field = scan.next();
            if (field.equalsIgnoreCase("Accounts")) 
            {
                System.out.println(" ------- In this Field we cannot have a Stock  ------ ");                
            }
            else if (field.equalsIgnoreCase("Gaming")) 
            {
                System.out.println("You selected Type is Gaming Field \n In this type we Provide HP, Acer Laptops ");
                System.out.println("Enter your Brand");
                String brand = scan.next();
                switch (brand) {
                    case "HP":
                        System.out.println("In HP, we have HP-VICTUS Model....!");
                        System.out.println("Enter Your Model");
                        String model = scan.next();
                          if (model.equalsIgnoreCase("HP-Victus")) 
                          {
                            System.out.println("  In VICTUS we have 8GB RAM 512GB SSD and 16GB RAM 512GB SSD Variant"); 
                            System.out.println("Enter your needed Variant");
                            String ramvariant= scan.next();
                              if (ramvariant.equalsIgnoreCase("8gb")) 
                              {
                                 System.out.println("  You chooses the 8GB RAM Variant"); 
                                 System.out.println("This variant features includes fast, quick response, secure, 4GB Graphics Card and 1 Year Warranty");
                                 System.out.println("If any Change below 20000 we provide only Seconds Laptop \n Above 20000 to 40000 we provide i3 Processor \n Above 40000 we Provide i5 Processor");
                                 System.out.println("If you like to buy this Product \n Please pay your amount sir/mam ");
                                 System.out.println("Enter Your Amount");
                                 int amount = scan.nextInt();
                                   if (amount >= 40000) 
                                   {
                                        System.out.println(" You selected amount is Above 40000 we provide i5 Processor Laptop \n Your Amount is paid sir can you please take your Bill and the Warranty Card...!");
                                        System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                                        System.out.println("------ Thank You Sir any queries Contact Us ------");
                                   }
                                     else if ( amount <= 20000 ) 
                                     {
                                        System.out.println("You selected below 20000 we have only provide Seconds Laptop");  
                                     }
                                     else if ( ( amount > 20000 ) && ( amount <= 40000) ) 
                                     {
                                       System.out.println("You selected Above 20000 to 40000 price we provide i3 processor Laptop");  
                                     }
                                   else{
                                     System.out.println("You Entered a wrong Amount....!");
                                   }
                              }
                                else if (ramvariant.equalsIgnoreCase("16gb")) 
                                {
                                    System.out.println("  You chooses the 16GB Variant"); 
                                    System.out.println("This variant features includes fast,secure, 4GB Graphics Card and 1 Year Warranty");
                                    System.out.println("If any Change below 20000 we provide only Seconds Laptop \n Above 20000 to 40000 we provide i3 Processor Laptop \n Above 40000 we Provide i5 Processor Laptop");
                                    System.out.println("If you like to buy this Product \n Please pay your amount sir/mam ");
                                    System.out.println("Enter Your Amount");
                                    int amount = scan.nextInt();
                                      if (amount >= 40000) 
                                      {
                                           System.out.println(" You selected amount is Above 40000 we provide i5 Processor Laptop \n Your Amount is paid sir can you please take your Bill and the Warranty Card...!");
                                           System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                                           System.out.println("------ Thank You Sir any queries Contact Us ------");
                                      }
                                        else if ( amount <= 20000 ) 
                                        {
                                           System.out.println("--- You selected below 20000 we have only provide Seconds Laptop ---");  
                                        }
                                        else if ( ( amount > 20000 ) && ( amount <= 40000) ) 
                                        {
                                          System.out.println("--- You selected Above 20000 to 40000 price we provide i3 processor Laptop ---");  
                                        }
                                   else{
                                     System.out.println(" ---- You Entered a wrong Amount....! ----");
                                   }
                                }
                              else 
                              {
                                System.out.println("--- Please select the correct RAM Variant ---");
                              }
                          }
                          else 
                          {
                            System.out.println("------ Please select the correct Model -----");
                          }
                        break;
                    case "Acer":
                        System.out.println("In Acer, we have Acer Aspire-5 and Aspire-7 model....!");
                        System.out.println("Enter Your Model");
                        String acermodel = scan.next();
                         if (acermodel.equalsIgnoreCase("Aspire-5")) 
                         {
                            System.out.println("This variant Price is 58000");
                            System.out.println(" If you like this Product \n Please pay your amount sir/mam");
                            System.out.println("Enter Your Amount");
                            int amount = scan.nextInt();
                             if (amount == 58000) 
                             {
                               System.out.println("Your Amount 58000 is paid sir can you please take your Bill and the Warranty Card...!"); 
                               System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                               System.out.println("------- Thank You Sir any queries Contact Us -------"); 
                             }
                             else
                             {
                                System.out.println("----- Please enter the correct Amount -----");
                             }
                         }
                        if (acermodel.equalsIgnoreCase("Aspire-7")) 
                        {
                            System.out.println("This variant Price is 65000");
                            System.out.println(" If you like this Product \n Please pay your amount sir/mam");
                            System.out.println("Enter Your Amount");
                            int amount = scan.nextInt();
                             if (amount == 65000) 
                             {
                               System.out.println("Your Amount 65000 is paid sir can you please take your Bill and the Warranty Card...!"); 
                               System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                               System.out.println("------- Thank You Sir any queries Contact Us -------"); 
                             }
                             else
                             {
                                System.out.println("--- Please enter the correct Amount ---");
                             }
                        }
                        break;
                    default:
                         System.out.println("----- Please select the correct type of Laptop Brand -----");
                        break;
                }
            }
            else if (field.equalsIgnoreCase("IT-Field")) 
            {
                System.out.println("You selected Type is IT Field \n In this Field we provide Lenovo, Macbook");
                System.out.println("Enter Your Model");
                String model = scan.next();
                 if (model.equalsIgnoreCase("Lenovo")) 
                 {
                    System.out.println("  In Lenovo we provide two Products one is  Slim-3 and another is Ideapad-3");
                    System.out.println("  This two models Features includes Fastbrowsing and Smooth Performance \n This cost includes slim-3 as 70000 and Ideapad-3 as 75000");
                    System.out.println("----  Select Your variant ----");
                    String variant = scan.next();
                       if (variant.equalsIgnoreCase("Ideapad-3")) 
                       {
                          System.out.println("You chooses Ideapad-3 \n Please enter your amount");
                          int lenovoamount = scan.nextInt();
                           if (lenovoamount == 75000) 
                          {
                            System.out.println("Your Amount is 75000 paid sir can you please take your Bill and the Warranty Card...!"); 
                            System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                            System.out.println("------- Thank You Sir any queries Contact Us -------");  
                          }
                          else 
                          {
                            System.out.println(" Please enter the correct Amount....! ");
                          }
                       }
                      if (variant.equalsIgnoreCase("Slim-3")) 
                      {
                        System.out.println("You chooses slim-3 ");
                        System.out.println("Enter your amount sir");
                        int amount = scan.nextInt();
                          if (amount == 70000) 
                          {
                            System.out.println("Your Amount is 70000 paid sir can you please take your Bill and the Warranty Card...!"); 
                            System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                            System.out.println("------- Thank You Sir any queries Contact Us -------");  
                          }
                          else 
                          {
                            System.out.println("Please enter the correct Amount....!");
                          }
                      } 
                 }
                  if (model.equalsIgnoreCase("Macbook")) 
                 {
                     System.out.println("In Macbook, we provide Apple-M2, Apple-M2-Max Models....! \n This price includes Apple-M2 as 100000, Apple-M2-Max as 130000");
                     System.out.println("  Enter Your Model");
                     String macmodel = scan.next();
                      if (macmodel.equalsIgnoreCase("Apple-M2")) 
                      {
                         System.out.println("  This Variant features is Awesome, Smooth Performance and have a Good look"); 
                         System.out.println("  If you like this product \n Please pay your Amount sir...!");
                         int macamount = scan.nextInt();
                           if (macamount == 100000) 
                           {
                              System.out.println("Your amount is 100000 paid sir can you please take your Bill and the Warranty Card...!");
                              System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                              System.out.println("------- Thank You Sir any queries Contact Us -------"); 
                           }
                           else 
                           {
                            System.out.println("------ Please enter the correct Amount -----");
                           }
                      }
                     if (macmodel.equalsIgnoreCase("Apple-M2-Max")) 
                     {
                        System.out.println("  This Variant features is compatibility with all your go-to-apps with six speaker with Spatial Audio"); 
                        System.out.println("  If you like this product \n Please pay your Amount sir...!");
                        int macamount = scan.nextInt();
                        if (macamount == 130000) 
                           {
                              System.out.println("  Your amount is 130000 paid sir can you please take your Bill and the Warranty Card...!");
                              System.out.println("  Warranty Card is useful for Laptop any Problems bring this Card to claim and useful for the services....!");
                              System.out.println("------- Thank You Sir any queries Contact Us -------"); 
                           }
                           else 
                           {
                            System.out.println("------- Please enter the correct Amount ---------");
                           }
                     }
                 }
            }
            else
            {
                System.out.println("-------- Please Select the correct Field Type  --------- ");
            }
        }
    }
    public static void main(String[] args) 
    {      
        laptopvalues();
    }
}