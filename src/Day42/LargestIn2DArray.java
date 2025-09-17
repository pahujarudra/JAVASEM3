package Day42;

import java.util.Scanner;

public class LargestIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            int max = matrix[i][0];
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Maximum in Array " + (i + 1) + " : " + max);
        }
    }
}
