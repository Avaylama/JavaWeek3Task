public class CaseCounter {
    public static void countCase(String str) {
        int upper = 0, lower = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }

    public static void main(String[] args) {
        countCase("Java Is Fun"); 
    }
}
 
    

