package core_java.encapsulation;

public class process 
{
    public static void main(String[] args) 
    {
        employee_details obj = new employee_details();

        obj.setEmpid(1);
        obj.setEmp_age(21);
        obj.setEmp_name("Praveen");
        

        System.out.println( "Employee ID is : " + obj.getEmp_id());
        System.out.println( "Employee Age is : " + obj.getEmp_age());
        System.out.println( "Employee Name is " + obj.getEmp_name());
    } 
}
