package in.sp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudFuntions crud = new CrudFuntions();
        Scanner sc = new Scanner(System.in);
        Employee emp;

        System.out.println("===== EMPLOYEE CRUD MENU =====");
        System.out.println("1. Insert Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Display Employee");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Salary: ");
                float salary = sc.nextFloat();

                emp = new Employee(id, name, salary);
                crud.insert(emp);
                break;

            case 2:
                System.out.print("Enter ID to update: ");
                int uid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new Name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new Salary: ");
                float newSalary = sc.nextFloat();

                emp = new Employee(uid, newName, newSalary);
                crud.update(emp);
                break;

            case 3:
                System.out.print("Enter ID to delete: ");
                int did = sc.nextInt();

                crud.delete(did);
                break;

            case 4:
                System.out.print("Enter ID to display: ");
                int diid = sc.nextInt();

                crud.display(diid);
                break;

            default:
                System.out.println("❌ Invalid choice!");
        }

        sc.close();
    }
}