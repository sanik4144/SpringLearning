package in.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        Scanner inp = new Scanner(System.in);

//        System.out.println("-----INSERTION-----");
//        System.out.print("Enter Employee ID: ");
//        int empId = Integer.parseInt(inp.nextLine());
//
//        System.out.print("Enter Employee Name: ");
//        String name = inp.nextLine();
//
//        System.out.print("Enter Employee Salary: ");
//        int salary = Integer.parseInt(inp.nextLine());
//
//
//        String insert_query = "INSERT INTO employee VALUES(?, ?, ?)";
//        int value = jdbcTemplate.update(insert_query, empId, name, salary);
//        if(value >0) System.out.println("Insertion Success");
//        else System.out.println("Insertion Failed");

//        System.out.println("-----DELETION-----");
//        System.out.print("Enter EmployeeId to delete: ");
//        int empId = Integer.parseInt(inp.nextLine());
//
//        String delete_query = "DELETE FROM employee WHERE emp_id = ?";
//        int count = jdbcTemplate.update(delete_query, empId);
//        if(count>0) System.out.println("Deletion Successful");
//        else System.out.println("Deletion Failed");

//        System.out.println("-----UPDATE-----");
//        System.out.print("Enter EmployeeId to update: ");
//        int empId = Integer.parseInt(inp.nextLine());
//        System.out.print("Enter updated salary: ");
//        int empSalary = Integer.parseInt(inp.nextLine());
//
//        String update_query = "UPDATE employee SET emp_salary = ? WHERE emp_id = ?";
//        int count = jdbcTemplate.update(update_query, empSalary, empId);
//        if(count>0) System.out.println("Updation Successful");
//        else System.out.println("Updation Failed");

        System.out.println("-----SELECTION-----");
        System.out.print("Enter EmployeeId to show details: ");
        int id = Integer.parseInt(inp.nextLine());

//        String select_query_all = "SELECT * FROM employee";
        String select_query = "SELECT * FROM employee WHERE emp_id = ?";

//        List<Employee> emp_list = jdbcTemplate.query(select_query_all, new EmployeeRowMapper());
        Employee emp1 = jdbcTemplate.queryForObject(select_query, new EmployeeRowMapper(), id);

//        for(Employee emp:emp_list){
//            System.out.println(emp.getEmpId()+" -- "+emp.getEmpName()+" -- "+emp.getEmpSalary());
//        }

        System.out.println(" ID -- Name -- Salary");
        System.out.println("----------------------");
        System.out.println(emp1.getEmpId()+" -- "+emp1.getEmpName()+" -- "+emp1.getEmpSalary());
    }
}