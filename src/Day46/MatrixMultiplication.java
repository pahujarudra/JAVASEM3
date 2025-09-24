package Day46;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns of matrix 1: ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        int[][] m1 = new int[p][q];
        for(int i = 0; i < p; i++) {
            for(int j = 0; j < q; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows and columns of matrix 2: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(m != q) {
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] m2 = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] m3 = new int[p][n];

        for(int i = 0; i < p; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < q; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for(int i = 0; i < p; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
