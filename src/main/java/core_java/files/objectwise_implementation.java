package core_java.files;

import java.io.Serializable;

public class objectwise_implementation implements Serializable
{
    String mobile_brand;
    String mobile_model;
    double mobile_price;
    int mobile_ram;

    public objectwise_implementation(String mobile_brand,String mobile_model,double mobile_price,int mobile_ram)
    {
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        this.mobile_price = mobile_price;
        this.mobile_ram = mobile_ram;
    }

    @Override
    public String toString() {
        return "objectwise_implementation [mobile_brand=" + mobile_brand + ", mobile_model=" + mobile_model
                + ", mobile_price=" + mobile_price + ", mobile_ram=" + mobile_ram + "]";
    }

    
}