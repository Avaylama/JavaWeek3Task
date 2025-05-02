public class DuckNumber {
    public static boolean isDuck(int num) {
        while (num > 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isDuck(1023)); 
    }
}
