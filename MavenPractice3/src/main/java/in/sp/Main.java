package in.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.naming.Name;
import java.util.*;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static void insert(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        System.out.println("-----Insertion-----");
        System.out.print("Enter Employee ID: ");
        int empId = Integer.parseInt(inp.nextLine());
        System.out.print("Enter Employee Name: ");
        String empName = inp.nextLine();
        System.out.print("Enter Employee Salary: ");
        int empSalary = Integer.parseInt(inp.nextLine());

        Map<String, Object> mp = new HashMap<String, Object>();
        mp.put("key_empId", empId);
        mp.put("key_empName", empName);
        mp.put("key_empSalary", empSalary);

        String insert_query = "INSERT INTO employee VALUES(:key_empId, :key_empName, :key_empSalary)";
        int value = namedParameterJdbcTemplate.update(insert_query, mp);
        if(value>0) System.out.println("Insertion Success");
        else System.out.println("Insertion Failed");
    }

    static void update(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        System.out.println("-----Update-----");
        System.out.print("Enter the Employee ID to Update: ");
        int empId = Integer.parseInt(inp.nextLine());
        System.out.print("Enter the Updated Salary: ");
        int empSal = Integer.parseInt(inp.nextLine());

        Map<String, Object> mp = new HashMap<String, Object>();
        mp.put("key_id", empId);
        mp.put("key_sal", empSal);

        String update_query = "UPDATE employee SET emp_salary = :key_sal WHERE emp_id = :key_id";
        int value = namedParameterJdbcTemplate.update(update_query, mp);
        if(value>0) System.out.println("Update Success");
        else System.out.println("Update Failed");
    }

    static void delete(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        System.out.println("-----Deletion-----");
        selectAll(namedParameterJdbcTemplate);
        System.out.println();
        System.out.print("Enter the Employee ID to Delete: ");
        int empId = Integer.parseInt(inp.nextLine());
        Map<String, Object> mp = new HashMap<String, Object>();
        mp.put("key_empId", empId);

        String delete_query = "DELETE FROM employee WHERE emp_id = :key_empId";
        int value = namedParameterJdbcTemplate.update(delete_query, mp);
        if (value > 0) System.out.println("Deletion Success");
        else System.out.println("Deletion Failed");

        selectAll(namedParameterJdbcTemplate);
    }

    static void selectAll(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        System.out.println("---Employee List---");

        String select_query = "SELECT * FROM employee";

        List<Employee> emp_list = namedParameterJdbcTemplate.query(select_query, new EmployeeRowMapper());

        System.out.println("ID -- Name -- Salary");
        System.out.println("--------------------");
        for(Employee emp: emp_list){
            System.out.println(emp.getEmpId()+" -- "+emp.getEmpName()+" -- "+emp.getEmpSalary());
        }
    }

    static void selectOne(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        System.out.println("----Employee-----");
        System.out.print("Enter the Employee ID: ");
        int empId = Integer.parseInt(inp.nextLine());
        Map<String, Object> mp = new HashMap<String, Object>();
        mp.put("key_id", empId);

        String select_query = "SELECT * FROM employee WHERE emp_id = :key_id";
        Employee emp = namedParameterJdbcTemplate.queryForObject(select_query, mp,new EmployeeRowMapper());

        System.out.println("ID -- Name -- Salary");
        System.out.println("--------------------");
        System.out.println(emp.getEmpId()+" -- "+emp.getEmpName()+" -- "+emp.getEmpSalary());
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

        System.out.println("Press 0 to Insert");
        System.out.println("Press 1 to Update");
        System.out.println("Press 2 to Delete");
        System.out.println("Press 3 to Display(All)");
        System.out.println("Press 4 to Display(One)");
        System.out.print("What to do? --> ");
        int st = Integer.parseInt(inp.nextLine());
        switch(st) {
            case  0 -> insert(namedParameterJdbcTemplate);
            case  1 -> update(namedParameterJdbcTemplate);
            case  2 -> delete(namedParameterJdbcTemplate);
            case  3 -> selectAll(namedParameterJdbcTemplate);
            case  4 -> selectOne(namedParameterJdbcTemplate);
            default -> System.out.println("??");
        };
    }
}