package Day43;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        int matrix[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int product = 1;
        for(int i = 0; i < n; i++) {
            product *= matrix[i][i];
        }

        for(int i = 0; i < n; i++) {
            matrix[i][i] = product;
        }

        for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
