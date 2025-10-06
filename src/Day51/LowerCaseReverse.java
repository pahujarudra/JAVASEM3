package Day51;

import java.util.Scanner;

public class LowerCaseReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
