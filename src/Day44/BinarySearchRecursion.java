package Day44;

import java.util.Scanner;

public class BinarySearchRecursion {
    static int binarySearch(int[] arr, int left, int right, int target) {
        if(left > right) return -1;
        int mid = (left + right) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binarySearch(arr, left, mid - 1, target);
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int n = sc.nextInt();

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr= new int[size];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int index = BinarySearchRecursion.binarySearch(arr, 0, size - 1, n);
        if(index == -1) System.out.println("Element not found");
        else System.out.println("Element found at index " + index);
    }
}
