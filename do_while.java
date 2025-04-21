import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size plz : ");
        int n =  sc.nextInt();
        
        int i = 0;

        do{
            System.out.println("Kaha se ye garmi aayi?");
            i++;
        }while(i <= n);
        sc.close();
    }    
}
