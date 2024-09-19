import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Using if-else to find maximum
        int maxUsingIfElse;
        if (num1 > num2) {
            maxUsingIfElse = num1;
        } else {
            maxUsingIfElse = num2;
        }
        System.out.println("Maximum using if-else: " + maxUsingIfElse);

        // Using ternary operator to find maximum
        int maxUsingTernary = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum using ternary operator: " + maxUsingTernary);

        scanner.close();
    }
}