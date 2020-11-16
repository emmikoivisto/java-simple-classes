public class Calculator {
    private int number1;
    private int number2;


    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }
}


// add, subtract, multiply, divide