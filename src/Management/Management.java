package Management;

import Employee.Employee;
import Employee.Manager;
import Employee.Cashier;
import Payment.Payment;
import Products.Product;
import Recipt.Recipt;
import Payment.CardPayment;
import Payment.CashPayment;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    ArrayList<Employee> employee = new ArrayList<Employee>();
    ArrayList<Product> product = new ArrayList<Product>();
    ArrayList<Recipt> allRecipt = new ArrayList<Recipt>();
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

    // get current clockin employee
    public Employee getCurrentEmployee(){
        Employee myEmployee = null;
        for (Employee emp: employee) {
            if(emp.isClockIn()){
                myEmployee = emp;
                System.out.println(myEmployee.getEmployeeName()+" is already clocked in");
                break;
            }
        }
        if(myEmployee == null){
            System.out.println("No One is Clocked In Yet");
            return null;
        }
        return myEmployee;
    }


    public void punchProduct() {
        if (getCurrentEmployee() == null) return;
        showProducts();
        int productId;
        ArrayList<Product> punchedProduct = new ArrayList<Product>();
        do {
            boolean found = false;
            System.out.println("Enter Product Id");
            productId = s.nextInt();
            for (Product p : product) {
                if (productId == p.getProductId()) {
                    punchedProduct.add(p);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Wrong Product");
            }
        } while (productId != -1);

        Recipt currentRecipt = new Recipt(getCurrentEmployee(), punchedProduct);
        allRecipt.add(currentRecipt);
        displayReceipt(currentRecipt);
        processPayment(currentRecipt.showRecipt());
    }

    private void displayReceipt(Recipt receipt) {
        double totalAmount = receipt.showRecipt();
        System.out.println("Total Amount: " + String.format("%2f",totalAmount));
    }


    public void showAllRecipts() {
        for (var r : allRecipt) {
            r.showRecipt();
        }
    }

    public void processPayment(double totalAmount){
        System.out.println("Select Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        int paymentChoice = s.nextInt();

        Payment paymentMethod;
        switch (paymentChoice) {
            case 1:
                paymentMethod = new CashPayment();
                System.out.println("Please give money: ");
                double givenAmount = s.nextDouble();
                paymentMethod.processPayment(totalAmount,givenAmount);
                break;
            case 2:
                System.out.println("Enter Card Number:");
                String cardNumber = s.next();
                paymentMethod = new CardPayment(cardNumber);
                paymentMethod.processPayment(totalAmount);
                break;
            default:
                System.out.println("Invalid Payment Method. Defaulting to Cash Payment.");
                paymentMethod = new CashPayment();
                break;
        }

    }
}
