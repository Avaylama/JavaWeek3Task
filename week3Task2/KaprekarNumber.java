public class KaprekarNumber {
    public static boolean isKaprekar(int num) {
        int sq = num * num;
        String str = String.valueOf(sq);
        for (int i = 1; i < str.length(); i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == num) return true;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isKaprekar(45)); 
    }
}
