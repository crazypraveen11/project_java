package core_java.encapsulation;

public class customer_details 
{
     int cust_id;
     int cust_age;
    String cust_name;
    public void setcustomer_id(int cust_id)
    {
        this.cust_id = cust_id;
    }

    public int getcustomer_id()
    {
        return cust_id ;
    }

    public void setcustomer_age(int cust_age)
    {
        this.cust_age = cust_age;
    }

    public int getcustomer_age()
    {
        return cust_age;
    }
    
    public void setcustomer_name(String cust_name)
    {
        this.cust_name = cust_name;
    }

    public String getcustomer_name()
    {
        return cust_name;
    }
}
