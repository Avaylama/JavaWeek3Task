import java.util.Scanner;

public class PerfectSquare20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
        sc.close();
    }
}
