import java.util.Scanner;

public class reverseString {

    // Method 1: Reverse using loop
    public static void reverseWithLoop(String str) {
        String reversed = "";  // Start with an empty string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character in reverse order
        }
        System.out.println("Reversed with loop: " + reversed);
    }

    // Method 2: Reverse using StringBuilder
    public static void reverseWithStringBuilder(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed string with StringBuilder: " + reversed);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();  // Get the string input from the user

        // Call both methods to reverse the string
        reverseWithLoop(str);
        reverseWithStringBuilder(str);
    }
}
