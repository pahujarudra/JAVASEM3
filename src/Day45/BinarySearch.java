package Day45;

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to search: ");
        int n = sc.nextInt();

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter sorted elements: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int index = binarySearch(arr, n);
        if(index == -1) System.out.println("Element not found");
        else System.out.println("Element found at index " + index);
    }

}
