package java_homework_week8_ss;

/**
 * Display left angle triangle of * using nested for loops
 */
public class Programme15_LeftTriangle {

    public static void leftSideTriangle() {//static method

        int n = 5;

        for (int i = 1; i <= n; i++) {//for loop for row

            for (int c = 1; c <= i; c++) {//for loop for column
                System.out.print("*");
            }
            System.out.println();//for print nextline
        }
    }

    public static void main(String[] args) {//main method
        leftSideTriangle();
    }
}
