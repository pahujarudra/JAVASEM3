package Day41;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to enter the element at: ");
        int pos = sc.nextInt();

        System.out.print("Enter element to add: ");
        int num = sc.nextInt();

        for(int i = 5; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = num;
        System.out.println(Arrays.toString(arr));
    }
}
