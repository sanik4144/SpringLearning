package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private int rollno;

    @Autowired
    private Address address;
    @Autowired
    private Subjects subjects;

    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

//    public void setAddress(Address address) {                           //Manual DI
//        this.address = address;
//    }

//    public void setSubjects(Subjects subjects) {                        //Manual DI
//        this.subjects = subjects;
//    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollno);
        System.out.println("Address: "+address);
        System.out.println("Subjects: "+subjects);
    }
}
