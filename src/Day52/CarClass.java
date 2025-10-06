package Day52;

class Car {
    public String make;
    public int year;

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
}

public class CarClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "BMW";
        c.year = 2025;

        c.printDetails();
    }
}
