import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.1416;
        double area = pi * r * r;
        System.out.println("The area of the circle is: " + area);
    }
}
