public class CompoundInterest {
    public static double calculate(double p, double r, int t) {
        double amount = p;
        for (int i = 0; i < t; i++) {
            amount *= (1 + r / 100); 
            
        }
        return amount;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1000, 5, 2)); 
    }
}
