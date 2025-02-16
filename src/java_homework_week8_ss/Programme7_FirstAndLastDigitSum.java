package java_homework_week8_ss;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class Programme7_FirstAndLastDigitSum {


    public static int sumFirstAndLastDigit(int number) {//static method

        if (number < 0) {//if condition
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) {//while loop
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {//main method
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(9460));
    }
}
