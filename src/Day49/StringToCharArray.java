package Day49;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] ch = str.toCharArray();
        ch[0] = 'X';

        System.out.println("Original String: " + str);
        System.out.println("Modified Array: " + Arrays.toString(ch));
    }
}
