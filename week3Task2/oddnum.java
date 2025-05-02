public class oddnum {
    public static void oddnumbers(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        oddnumbers(15);
    }
}
