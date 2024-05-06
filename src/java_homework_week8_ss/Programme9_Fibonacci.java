package java_homework_week8_ss;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_Fibonacci {

    public static void fibo() {
        int n1 = 1;
        int n2 = 1;
        int n = 8;

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < n; i++) {
            int x = n1 + n2;
            System.out.print(x + " ");
            n1 = n2;
            n2 = x;
        }
    }

    public static void main(String[] args) {
        fibo();
    }
}
