public class PalindromePrime {
    public static boolean isPalindromePrime(int num) {
        return isPrime(num) && num == reverse(num);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePrime(131));
    }
}
