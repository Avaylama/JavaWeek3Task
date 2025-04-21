
import java.util.Scanner;

public class divisible4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.println("Enter number : ");
        int a = sc.nextInt();

        if (a % 5 == 0){
            System.out.println("Divisible by 5.");
        }
        else if (a % 11 == 0){
            System.out.println("Divisible by 11.");
        } else{
            System.out.println("Cannot be divided by both 5 and 11.");
        }
    }
}
