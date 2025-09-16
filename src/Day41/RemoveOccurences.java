package Day41;

public class RemoveOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 3, 3, 5, 6, 7};
        int num = 3;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                arr[i] = 0;
            }
        }
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
