package in.sp.beans;

public class Dateofbirth {
    private int day;
    private String month;
    private int year;

    public Dateofbirth(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}
