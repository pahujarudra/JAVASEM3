package Day44;

import java.util.Scanner;

public class TowerOfHanoiRecursion {

//    Move n-1 disks from source → auxiliary (destination acts as helper).
//    Move the nth disk (the largest) from source → destination.
//    Move the n-1 disks from auxiliary → destination (source acts as helper).

    static void hanoi(int n, char start, char mid, char end) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + start + " to " + end);
            return;
        }

        hanoi(n - 1, start, end, mid);
        System.out.println("Move disk " + n + " from " + start + " to " + end);
        hanoi(n - 1, mid, start, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        // Static method main can directly call static method hanoi, without using TowerOfHanoiRecursion.hanoi();
        hanoi(n, 'A', 'B', 'C');
    }
}
