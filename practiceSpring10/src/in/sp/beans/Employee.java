package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String name;

    @Autowired
    private Dateofbirth dob;
    @Autowired
    private Expertise exp;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Date Of Birth: "+dob);
        System.out.println("Expertise: "+exp);
    }
}
