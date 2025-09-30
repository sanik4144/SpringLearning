package in.sp.beans;

public class Dateofbirth {
    private int day;
    private String month;
    private int year;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return day+"st "+month+", "+year;
    }
}
