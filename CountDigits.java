import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Number of digits : 1");
        }else{
            int c = 0;
            n = Math.abs(n);

            while(n > 0){
                c++;
                n /= 10;
            }
            System.out.println("Number of digits : " +c);
        }
    }
}
