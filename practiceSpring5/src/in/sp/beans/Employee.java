package in.sp.beans;

public class Employee {
    private int empId;
    private String name;
    private int salary;
    private Dateofbirth dob;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(Dateofbirth dob) {
        this.dob = dob;
    }

    public void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Date Of Birth: " +dob);
        System.out.println("Salary: "+salary);
    }
}
