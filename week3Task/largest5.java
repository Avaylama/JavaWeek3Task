
import java.util.Scanner;

public class largest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the first number :");
        int a = sc.nextInt();

        System.out.println("Enter the second number :");
        int b = sc.nextInt();
    
        System.out.println("Enter the third number :");
        int c = sc.nextInt();

        if (a > b){
            System.out.println(a + "is largest.");
        }
        else if (a > c){
            System.out.println(a + "is largest.");
        }
        else if (b > c){
            System.out.println(b + "is largest.");
        }
        if (c > a){
            System.out.println(a + "is largest.");
        }
        sc.close();
    }
}
