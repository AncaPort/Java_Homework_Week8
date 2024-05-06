package java_homework_week8_ss;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme13_SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {//static method with returntype withparameter

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int num1 = a % 10;
        int num11 = a / 10;
        int num2 = b % 10;
        int num22 = b / 10;

        return (num1 == num2 || num1 == num22 || num11 == num2 || num11 == num22);
    }

    public static void main(String[] args) {//main method
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(43, 67));
        System.out.println(hasSharedDigit(1, 2));
        System.out.println(hasSharedDigit(65, 76));
    }
}
