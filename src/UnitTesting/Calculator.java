package src.UnitTesting;

public class Calculator {

    public Calculator() {

    }

    public static float add(float firstNumber, float secondNumber){
        return firstNumber + secondNumber;
    }

    public static int subtract(float firstNumber, float secondNumber){
        return (int) (firstNumber - secondNumber);
    }

    public static int divide(float firstNumber, float secondNumber){
        return (int) (firstNumber / secondNumber);
    }

    public static int multiply(float firstNumber, float secondNumber){
        return (int) (firstNumber * secondNumber);
    }

    public static int getRemainder(float firstNumber, float secondNumber){
        return (int) (firstNumber % secondNumber);
    }

}
