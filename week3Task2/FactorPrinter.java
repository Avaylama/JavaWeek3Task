public class FactorPrinter {
    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++)
            if (n % i == 0) System.out.print(i + " ");
    }

    public static void main(String[] args) {
        printFactors(12); 
    }
}
