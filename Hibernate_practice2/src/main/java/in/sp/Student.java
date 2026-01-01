package in.sp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int stdId;
    private String name;
    private double marks;

    public Student(int stdId, String name, double marks) {
        this.stdId = stdId;
        this.name = name;
        this.marks = marks;
    }

    public Student(){}

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
