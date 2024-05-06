package java_homework_week8_ss;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */
public class Programme18_SimpleCalculator {
    //The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
    double firstNumber;
    double secondNumber;

    //● Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {//Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {//Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {//*Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {//Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {//Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of the secondNumber from the firstNumber.
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {//Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {//Method named getDivisionResult without any parameters, it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
        return secondNumber != 0 ? firstNumber / secondNumber : 0;
    }

    public static void main(String[] args) {//main method

        Programme18_SimpleCalculator calculator = new Programme18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
