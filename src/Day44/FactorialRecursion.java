package Day44;

import java.util.Scanner;

public class FactorialRecursion {
    static int fact(int n) {
        if(n < 2) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        System.out.println("Factorial: " + FactorialRecursion.fact(n));
    }
}
