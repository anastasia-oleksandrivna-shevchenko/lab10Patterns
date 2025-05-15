package task6.ParametrizeMethod;

public class PowerCalculator {
    public int calculatePower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }
}
