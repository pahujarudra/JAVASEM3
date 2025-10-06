package Day52;

class Student {
    private String name;
    private char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
}

class School {
    public void printStudentDetails(Student s) {
        System.out.println("Name: " + s.getName());
        System.out.println("Grade: " + s.getGrade());
    }
}

public class StudentSchool {
    public static void main(String[] args) {
        Student s1 = new Student("Rudra", 'O');
        School chitkara = new School();
        chitkara.printStudentDetails(s1);
    }
}
