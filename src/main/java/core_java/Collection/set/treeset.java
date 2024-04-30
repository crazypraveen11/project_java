package core_java.Collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset 
{
    public static void main(String[] args) 
    {
        TreeSet <Employee_details> emp = new TreeSet<>();
        //Treeset ---> Not allow null object
        // Not allow duplicates 
        // order is by alphabetical order
        Employee_details emp1 = new Employee_details(1, "Praveen",19);
        Employee_details emp2 = new Employee_details(2, "Ashwin", 21);
        Employee_details emp3 = new Employee_details(3, "Ajith", 20);

        emp.add(emp3);
        emp.add(emp2);
        emp.add(emp1);

        // System.out.println(emp);

        Iterator it = emp.iterator();

        do{
            System.out.println(it.next());
        }
        while(it.hasNext());    
    } 
}

class Employee_details implements Comparable<Employee_details>
{
    Integer emp_Id;
    String emp_name;
    Integer emp_age;

    @Override
    public String toString() {
        return "Employee_details [ Employee ID = " + emp_Id + ", Employee Name  = " + emp_name + ", Employee Age = " + emp_age + "]";
    }

    public Employee_details(Integer emp_Id, String emp_name, Integer emp_age) {
        this.emp_Id = emp_Id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
    }

    @Override
    public int compareTo(Employee_details od) {
        return this.emp_age.compareTo(od.emp_age);
    }
}