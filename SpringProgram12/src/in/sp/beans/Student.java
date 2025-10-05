package in.sp.beans;

public class Student {
    private int id;
    private String name;
    private Address addr;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println(addr);
    }
}
