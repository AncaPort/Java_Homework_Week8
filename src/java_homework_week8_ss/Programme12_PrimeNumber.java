package java_homework_week8_ss;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */
public class Programme12_PrimeNumber {

    public static boolean prime(int number) {//static method
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {//main method

        Scanner scanner = new Scanner(System.in);//scanner for input data from console

        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();

        if (prime(number1)) {
            System.out.println(number1 + " is a prime number");
        } else {
            System.out.println(number1 + " is not a prime number");
        }
        scanner.close();//close scanner
    }
}
