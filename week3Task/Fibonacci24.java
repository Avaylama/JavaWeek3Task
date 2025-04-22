import java.util.Scanner;

public class Fibonacci24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        if (n >= 1) {
            System.out.print("Fibonacci Series: ");
            System.out.print(first);
        }

        if (n >= 2) {
            System.out.print(", " + second);
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(", " + nextTerm);
            first = second;
            second = nextTerm;
        }
        sc.close();
        System.out.println();
        
    }
}
