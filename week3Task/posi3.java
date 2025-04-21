
import java.util.Scanner;

public class posi3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.println("Enter the number :");
        int a = sc.nextInt();

        if (a < 0){
            System.out.println("Positive");
        }
        if (a > 0){
            System.out.println("Negative");

        }else{
            System.out.println("Zero");
        }
    }
}
