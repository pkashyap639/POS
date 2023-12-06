package Management;

import Employee.Employee;
import Employee.Manager;
import Employee.Cashier;

import java.util.ArrayList;

public class Management {
    ArrayList<Employee> employee = new ArrayList<Employee>();

    public void setEmployee(){
        employee.add(new Manager(101,"Nerissa",true,false));
        employee.add(new Manager(102,"Yogesh",true,false));
        employee.add(new Cashier(103,"Piyush",false,false));
        employee.add(new Cashier(104,"Mihir",false,false));
        employee.add(new Cashier(105,"Dhruv",false,false));
    }

    public void showEmployee(){
        System.out.println("All Employees: ");
        for (Employee emp: employee) {
            System.out.println(emp);
        }
    }

}
