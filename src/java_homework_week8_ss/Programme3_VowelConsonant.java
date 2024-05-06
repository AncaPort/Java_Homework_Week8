package java_homework_week8_ss;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Programme3_VowelConsonant {


    public static void main(String[] args) {//main method
        vowelCons();//static method calling
    }

    public static void vowelCons() {//static method

        Scanner scanner = new Scanner(System.in);//Scanner for input data from console

        System.out.println("Input an alphabet: ");
        String s1 = scanner.nextLine().toLowerCase();

        if (s1.length() == 1 && Character.isLetter(s1.charAt(0))) {//if condition
            char ch = s1.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error Message: Enter only single letter.");
        }
        scanner.close();//scanner close
    }
}
