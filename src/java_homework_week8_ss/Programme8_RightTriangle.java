package java_homework_week8_ss;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme8_RightTriangle {

    public static void triangle() {//static method

        int row = 5;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {//main method
        triangle();//static method calling in main method
    }

}
