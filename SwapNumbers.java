import java.util.Scanner;

public class SwapNumbers {

    // Method 1: Swap using + and -
    public static void swapWithAddSub(int a, int b) {
        System.out.println("\nBefore Swap (Add/Sub): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (Add/Sub): a = " + a + ", b = " + b);
    }

    // Method 2: Swap using XOR
    public static void swapWithXOR(int a, int b) {
        System.out.println("\nBefore Swap (XOR): a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap (XOR): a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        swapWithAddSub(a, b);
        swapWithXOR(a, b);

        sc.close();
    }
}
