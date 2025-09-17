package Day42;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Row " + i);
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
