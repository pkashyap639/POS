package Management;

import Employee.Employee;
import Employee.Manager;
import Employee.Cashier;
import Products.Product;

import java.util.ArrayList;

public class Management {
    ArrayList<Employee> employee = new ArrayList<Employee>();
    ArrayList<Product> product = new ArrayList<Product>();

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


}
