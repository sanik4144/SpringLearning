package in.sp.beans;

public class Employee {
    private int empId;
    private String name;
    private Dateofbirth dob;
    private Expertise exp;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Dateofbirth dob) {
        this.dob = dob;
    }

    public void setExp(Expertise exp) {
        this.exp = exp;
    }

    public void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Date Of Birth: "+dob);
        System.out.println("Expertise: "+exp);
    }
}
