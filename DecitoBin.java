import java.util.Scanner;

public class DecitoBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a decimal number: ");

        int n = sc.nextInt();  

        String binary = Integer.toBinaryString(n);  
        System.out.println("Binary: " + binary);

        sc.close(); 
    }
}
