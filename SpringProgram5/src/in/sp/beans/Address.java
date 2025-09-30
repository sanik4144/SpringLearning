package in.sp.beans;

public class Address {
    private int houseno;
    private String city;
    private int pinCode;

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "#"+houseno+","+city+"-"+pinCode;
    }
}
