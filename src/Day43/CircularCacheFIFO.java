package Day43;

import java.util.Arrays;
import java.util.Scanner;

public class CircularCacheFIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;
        System.out.print("Enter the count of elements you have: ");
        count = sc.nextInt();

        String[] cache = new String[5];
        int next = 0;

        for(int i = 0; i < count; i++) {
            // Adding pages
            cache[next] = sc.next();
            next = (next + 1) % cache.length;
        }

        System.out.println(Arrays.toString(cache));
    }
}
