package java_homework_week8_ss;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */
public class Programme1_ReadingUserInputChallenge {

    static int sum = 0;//static variable declaration
    static int count = 1;//static variable declaration

    public static void inputChallenge() {//static method for calculation of input number
        Scanner scanner = new Scanner(System.in);//scanner object for user to input data from console
        while (count <= 10) {//while loop
            System.out.println("Enter number #" + count + ":");
            if (scanner.hasNextInt()) {//if condition
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Entered number is invalid");
                scanner.next();
            }
        }
        System.out.println("The sum of 10 numbers is: " + sum);
        scanner.close();//close the scanner
    }

    public static void main(String[] args) {//main method
        inputChallenge();//static method calling
    }

}
