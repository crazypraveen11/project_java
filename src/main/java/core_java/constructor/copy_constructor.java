package core_java.constructor;

public class copy_constructor 
{
    String myname ;
    String mypass;
    String email;
    long mobile;
    String address;

    public copy_constructor(String username, String password,String email,long mobile,String address)
    {
       myname = username;   
       mypass = password;
       this.email = email;
       this.mobile = mobile;
       this.address = address;
       System.out.println("----- Parameterized constructor values -----");
       System.out.println("My name is " + myname);
       System.out.println("Password : " + mypass);
       System.out.println("Email ID is " + email);
       System.out.println("Mobile Number is : " + mobile);
       System.out.println("Address : " + address );
    }

    public copy_constructor(copy_constructor cc)
    {
        System.out.println("\n ------ Copy constructor values ------");
        System.out.println( "My Username is " + cc.myname);
        System.out.println("My password is : " + cc.mypass);
        System.out.println("My Email ID is " + cc.email);
        System.out.println("My Phone number is : " + cc.mobile );
        System.out.println("My Address is " + cc.address);
    }
    
    public static void main(String[] args) 
    {
        copy_constructor scan = new copy_constructor("Praveen","ps@11" ,"praveen1173@gmail.com",6379873794l,"Namakkal");
        

        copy_constructor scan1 = new copy_constructor(scan);  

       System.out.println(scan1);
    }
}
