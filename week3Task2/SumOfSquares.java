public class SumOfSquares {
    public static int sumSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d * d;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(123)); 
}
}
