package java_homework_week8_ss;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10_ArmstrongNumber {

    public void armStrong() {//Instance method

        Scanner scanner = new Scanner(System.in);//scanner declaration
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        int num1 = num;
        int numDigit = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigit);
            num /= 10;
        }
        if (sum == num1) {
            System.out.println(num1 + " is an Armstrong number");
        } else {
            System.out.println(num1 + " is not an Armstrong number");
        }
        scanner.close();//scanner close
    }

    public static void main(String[] args) {//main method
        Programme10_ArmstrongNumber obj = new Programme10_ArmstrongNumber();//object creation
        obj.armStrong();//Instance method calling via object
    }

}
