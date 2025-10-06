package Day49;

import java.util.Scanner;

public class VowelWithStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String vowels = "aeiouAEIOU";

        for(int i = 0; i < vowels.length(); i++) {
            str = str.replace(vowels.charAt(i), '*');
        }

        System.out.println(str);
    }
}
