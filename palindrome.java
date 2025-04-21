import java.util.Scanner;

public class palindrome {

    // Method 1: Using StringBuilder (STL)
    public static void palindromeStl(String s) {
        // Reverse the string using StringBuilder and compare with the original
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Using STL: " + s.equals(reversed)); // Check if original equals reversed
    }

    // Method 2: Using loop (without STL)
    public static void palindromeLoop(String s) {
        int n = s.length(); // Get the length of the string
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isPalindrome = false; // If characters don't match, it's not a palindrome
                break; // Exit loop
            }
        }

        System.out.println("Using Loop: " + isPalindrome); // Output the result
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String s = sc.nextLine(); // Take input from the user

        palindromeStl(s);  // Call Method 1 (StringBuilder)
        palindromeLoop(s); // Call Method 2 (Loop)

        sc.close(); // Close scanner to prevent resource leak
    }
}
