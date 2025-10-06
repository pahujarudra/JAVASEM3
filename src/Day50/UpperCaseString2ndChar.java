package Day50;

import java.util.Scanner;

public class UpperCaseString2ndChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.toUpperCase();

        System.out.println(str.charAt(2));
    }
}
