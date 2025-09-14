package Day37;

public class AllOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a = a + 2;
        b = b - 1;
        a = a * 2;
        b = b / 2;
        a = a % 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x = 7;
        int y = 10;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);

        boolean p = true;
        boolean q = false;

        System.out.println(p && q);
        System.out.println(p || q);
        System.out.println(!p);

        int num = -5;
        String ans = (num >= 0) ? "Positive" : "Negative";
        System.out.println(ans);
    }
}
