import Management.Management;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Management m =new Management();
        m.setEmployee();
        m.setProduct();
        Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nMenu");
            System.out.println("1. Clock In\n");
            System.out.println("2. Clock Out\n");
            System.out.println("-1. Exit\n");
            choice = s.nextInt();
            switch (choice){
                case 1: m.doClockIn(); break;
                case 2: m.doClockOut(); break;
                case 3:
                    System.out.println("Exiting Program\n");break;
                default:
                    System.out.println("Invalid Choice\n");
            }
        }while (choice!=-1);
    }
}