package Day38;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Using if-else
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }

    }
}
