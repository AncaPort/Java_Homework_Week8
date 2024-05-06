package java_homework_week8_ss;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme6_Triangle {

    public static void main(String[] args) {//main method
        Programme6_Triangle obj = new Programme6_Triangle();//object creation for instance method
        obj.printTriangle();//calling instance method via object
    }

    public void printTriangle() {//instance method

        Scanner scanner = new Scanner(System.in);//scanner for input data from console

        System.out.println("Enter number of rows: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();//scanner close
    }
}
