package in.sp.beans;

public class Address {
    private int houseno;
    private String city;
    private int pinCode;

    public Address(int houseno, String city, int pinCode){
        this.houseno = houseno;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "#"+houseno+","+city+"-"+pinCode;
    }
}
