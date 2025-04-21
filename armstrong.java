import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        int sum = 0, temp = n;
        
        // Find number of digits in the number
        int numDigits = String.valueOf(n).length(); 

        // Calculate sum of digits raised to the power of number of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);  // Raise the digit to the power of numDigits
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        if (n == sum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        sc.close();
    }
}
