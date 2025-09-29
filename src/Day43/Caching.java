package Day43;

import java.util.Scanner;

public class Caching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maxmimum possible length of array: ");
        int capacity = sc.nextInt();
        String[] arr = new String[capacity];
        int size = 0;

        System.out.print("Enter no. of elements: ");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " elements one by one");

        for(int i = 0; i < count; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            String n = sc.next();
            int pos = -1;
            for(int j = 0; j < size; j++) {
                if(arr[j].equals(n)) {
                    pos = j;
                    break;
                }
            }
            if(pos != -1) {
                for(int j = pos; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = n;
            } else {
                if(size < capacity) {
                    size++;
                }
                for(int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = n;
            }

            for(int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }
}
