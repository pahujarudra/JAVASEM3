package Day42;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[n - 1]));
    }
}
