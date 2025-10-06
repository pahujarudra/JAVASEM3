package Day51;

class Employee {
    String name;
    int id;
    String fields;

    public Employee(String name, int id, String fields) {
        this.name = name;
        this.id = id;
        this.fields = fields;
    }

    public String toString() {
        return "Name: " + name +"\nID: " + id + "\nFields: " + fields;
    }
}
public class EmployeeToString {
    public static void main(String[] args) {
        Employee em = new Employee("Rudra", 700, "BE CSE");
        System.out.println(em);
    }
}
