import java.util.Scanner;

public class multiplication12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter a number for multiplication table: ");
        int num = sc.nextInt();

        System.out.println("\nMultiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        
    }
}
