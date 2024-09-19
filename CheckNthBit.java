import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Input bit position (0-based index)
        System.out.print("Enter bit position (0-based index): ");
        int n = scanner.nextInt();
        
        scanner.close();
        
        // Check if nth bit is set (equals to 1)
        boolean isNthBitSet = (num & (1 << n)) != 0;
        
        // Output the result
        if (isNthBitSet) {
            System.out.println("The " + n + "th bit of " + num + " is set (equals to 1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (equals to 0).");
        }
    }
}