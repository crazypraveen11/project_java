package core_java.encapsulation;

public class connection {
    
    public static void main(String[] args) {
        
        customer_details obj = new customer_details();

        obj.setcustomer_id(20);
        obj.setcustomer_age(23);
        obj.setcustomer_name("Praveen");

        System.out.println("Customer ID : " + obj.getcustomer_id());
        System.out.println( "Customer Age : " + obj.getcustomer_age());
        System.out.println("Customer Name : " + obj.getcustomer_name());
    }
}
