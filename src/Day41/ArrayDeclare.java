package Day41;

public class ArrayDeclare {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.println("Position: " + i + " Element: " + arr[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Position: " + i + " Element: " + nums[i]);
        }
    }
}
