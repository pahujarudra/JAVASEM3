package Day40;

public class IntellijPrinting {
    public static void main(String[] args) {
        String str = "INTELLIJ";
        // Outer loop - controls the starting character
        for (int i = 0; i < str.length(); i++) {
            // Inner loop - prints characters from current index to end
            for (int j = i; j < str.length(); j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println(); // Move to next line
        }
    }
}
