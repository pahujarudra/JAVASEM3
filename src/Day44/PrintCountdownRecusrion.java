package Day44;

import java.util.Scanner;

public class PrintCountdownRecusrion {

    static void countdown(int n) {
        System.out.println(n);
        if(n == 0) return;
        countdown(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        PrintCountdownRecusrion.countdown(n);
    }

}
