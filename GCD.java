import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");

        int a = sc.nextInt();

        System.out.println("Enter num2 : ");
        int b = sc.nextInt();

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a + " is the gcd of a & b");

        sc.close();
    }    
}
