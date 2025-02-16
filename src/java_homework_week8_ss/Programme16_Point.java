package java_homework_week8_ss;

import java.awt.*;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this
 * Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 */
public class Programme16_Point {

    int x, y;//The class needs two fields (instance variables) with name x and y of type int.


    public Programme16_Point() {//The first constructor does not have any parameters (no-arg constructor).

    }

    public Programme16_Point(int x, int y) {//The second constructor has parameters x and y of type int and it needs to initialize the fields.
        this.x = x;
        this.y = y;
    }

    public int getX() {//* Method named getX without any parameters, it needs to return the value of x field.
        return x;
    }

    public int getY() {//* Method named getY without any parameters, it needs to return the value of y field.
        return y;
    }

    public void setX(int x) {//* Method named setX with one parameter of type int, it needs to set the value of the x field.
        this.x = x;
    }

    public void setY(int y) {//* Method named setY with one parameter of type int, it needs to set the value of the y field
        this.y = y;
    }

    public double distance() {//Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
        return distance(0, 0);
    }

    public double distance(int x, int y) {//Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Programme16_Point another) {//Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
        return distance(another.getX(), another.getY());
    }

    public static void main(String[] args) {//main method

        Programme16_Point first = new Programme16_Point(6, 5);
        Programme16_Point second = new Programme16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance(0.0, 0.0));
    }
}
