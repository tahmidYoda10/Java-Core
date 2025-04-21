import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n, num1 = 0, num2 = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        n = sc.nextInt();

        System.out.print("Fibonacci Series: " + num1 + " " + num2);

        for (int i = 2; i < n; i++) {
            int next = num1 + num2;
            System.out.print(" " + next);
            num1 = num2;
            num2 = next;
        }

        sc.close();
    }
}
