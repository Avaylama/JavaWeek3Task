public class SwapWithTemp {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swap(10, 20);
    }
}
