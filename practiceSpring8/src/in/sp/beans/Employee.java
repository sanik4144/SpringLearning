package in.sp.beans;

public class Employee {
    private int empId;
    private String name;
    private Dateofbirth dob;

    public Employee(int empId, String name, Dateofbirth dob) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
    }

    public void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Date Of Birth: "+dob);
    }
}
