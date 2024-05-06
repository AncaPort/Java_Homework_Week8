package java_homework_week8_ss;

/**
 * Write a program in Java to display the pattern like a diamond.
 *  While loop
 *
 */
public class Programme14_DiamondPrint {

    public static void main(String[] args) {//main method

        diamondPattern();//calling static method into the main method
    }

    public static void diamondPattern(){//static method
        int n = 13; //instance variable
        int spaces = n / 2;
        int stars = 1;

        // top part of the diamond
        int i = 0;
        while (i < n) {
            int j = 0;

            int spaceCount = 0; // for Print spaces
            while (spaceCount < spaces) {
                System.out.print(" ");
                spaceCount++;
            }
            int starCount = 0;// for Print stars
            while (starCount < stars) {
                System.out.print("*");
                starCount++;
            }
            System.out.println();// for going to the next line

            if (i < n / 2) {//if condition
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            i++;
        }
    }
}

