package in.sp.beans;

public class Employee {
    private int empId;
    private String name;
    private int salary;
    private Dateofbirth dob;

    public Employee(int empId, String name, int salary, Dateofbirth dob) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Date Of Birth: "+dob);
        System.out.println("Salary: "+salary);
    }
}
