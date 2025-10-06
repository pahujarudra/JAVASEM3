package Day52;

class FourWheeler {
    public String make;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class PublicPrivate {
    public static void main(String[] args) {
        FourWheeler fw = new FourWheeler();
        fw.make = "BMW";

        System.out.println(fw.make);

        // we cant use fw.year directly
        fw.setYear(2025);
        System.out.println(fw.getYear());
    }
}
