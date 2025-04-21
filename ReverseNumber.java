import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int reversed = 0;
        while(n != 0){
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reversed);
        sc.close();
    }
}
