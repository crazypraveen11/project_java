package core_java.encapsulation;
public class employee_details 
{
    private int emp_id;
    private int empl_age;
    String emp_name;

    public void setEmpid(int emp_id)
    {
        this.emp_id = emp_id;
    }

    public int getEmp_id()
    {
        return emp_id;
    }

    public void setEmp_age(int emp_age)
    {
        empl_age = emp_age;
    }

    public int getEmp_age()
    {
        return empl_age;
    }

    public void setEmp_name(String emp_name)
    {
        this.emp_name = emp_name;
    }

    public String getEmp_name()
    {
        return emp_name;
    }
     
}
