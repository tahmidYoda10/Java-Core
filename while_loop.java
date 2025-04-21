import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many time u wanna run : ");
        int n = sc.nextInt();
        int i = 1;
        while(i != n){
            System.out.println("Etai Bastob");
            i++;
        }
        sc.close();
    }
}
