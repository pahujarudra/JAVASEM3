package Day44;

import java.util.Scanner;

public class FibonacciRecursion {
    int fibo(int n) {
        if(n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        FibonacciRecursion obj = new FibonacciRecursion();

        for(int i = 0; i < n; i++) {
            System.out.print(obj.fibo(i) + " ");
        }

    }
}
