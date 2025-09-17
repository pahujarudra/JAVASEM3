package Day42;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum: " + sum);
        }
    }
}
