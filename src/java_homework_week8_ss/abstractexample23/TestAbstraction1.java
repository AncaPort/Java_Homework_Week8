package java_homework_week8_ss.abstractexample23;

public class TestAbstraction1 {

    //in ral scenario,method i called by programmer or user

    public static void main(String[] args) {
        Shape s=new Circle1();//in real scenario,object is provided thrrough method.e.g.getShape()method
        s.draw();
    }
}
