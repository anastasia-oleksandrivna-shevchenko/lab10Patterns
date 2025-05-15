package task6.replaceErrorCodeWithException;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ділення на нуль не допускається");
        }
        return dividend / divisor;
    }
}
