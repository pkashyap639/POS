package Management;

import Employee.Employee;
import Employee.Manager;
import Employee.Cashier;
import Products.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    ArrayList<Employee> employee = new ArrayList<Employee>();
    ArrayList<Product> product = new ArrayList<Product>();
    Scanner s = new Scanner(System.in);

    // Employees
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

    // Product

    public void setProduct(){
        product.add(new Product(1,"Chicken Burger",7.99, "Eatable"));
        product.add(new Product(2,"Fish Burger",10.32, "Eatable"));
        product.add(new Product(3,"Chicken Shawarma",12.00, "Eatable"));
        product.add(new Product(4,"French Fries",5.75, "Eatable"));
        product.add(new Product(5,"Soft Drink",5.75, "Drink"));
        product.add(new Product(6,"Chocolate Shake",5.75, "Drink"));
        product.add(new Product(7,"Mango Lemonade",5.75, "Drink"));
        product.add(new Product(8,"Strawberry Shake",5.75, "Drink"));
        product.add(new Product(9,"Extra Bag",0.25));
    }

    public void showProducts(){
        System.out.println("All Products: ");
        for (Product prod: product) {
            System.out.println(prod);
        }
    }

    // clocking functionality
    public void doClockIn(){
        System.out.println("Enter Employee Id: ");
        int empId = s.nextInt();
        boolean empFound = false;
        for (Employee emp: employee) {
            if(empId == emp.getEmployeeId()){
                if(!emp.isClockIn()){
                    emp.clockIn();
                    empFound = true;
                    break;
                }
            }
        }
        if(!empFound){
            System.out.println("Employee does Not Exists\n");
        }
    }

    public void doClockOut(){
        boolean anyClockIn = false;
        for (Employee emp: employee) {
            if(emp.isClockIn()){
                emp.clockOut();
                anyClockIn = true;
            }
        }
        if(!anyClockIn){
            System.out.println("No one is clocked in ");
        }
    }

}
