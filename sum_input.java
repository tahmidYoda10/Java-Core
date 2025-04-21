import java.util.Scanner;

public class sum_input {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of num1 & num2 : " +sum);
    }    
}
