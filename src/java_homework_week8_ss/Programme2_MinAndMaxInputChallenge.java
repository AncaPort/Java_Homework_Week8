package java_homework_week8_ss;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme2_MinAndMaxInputChallenge {

    public void minAndMax() {//Instance method for Min and Max

        Scanner scanner = new Scanner(System.in);//Scanner for user to input data from console

        System.out.println("Enter a numbers, for finish enter non-numeric value.");

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        while (true) {//while loop
            System.out.println("Please enter a number: ");
            if (scanner.hasNextInt()) {//if condition
                int num = scanner.nextInt();
                mn = Math.min(mn, num);
                mx = Math.max(mx, num);
            } else {
                System.out.println("entered number is invalid");
                break;
            }
        }
        if (mn != Integer.MAX_VALUE && mx != Integer.MIN_VALUE) {
            System.out.println("Minimun number is: " + mn);
            System.out.println("Maximum number is: " + mx);
        } else {
            System.out.println("Number is not valid");
        }
        scanner.close();//scanner close
    }

    public static void main(String[] args) {//main method
        Programme2_MinAndMaxInputChallenge obj = new Programme2_MinAndMaxInputChallenge();//object creation for instance method calling
        obj.minAndMax();//Instance method calling through object
    }

}
