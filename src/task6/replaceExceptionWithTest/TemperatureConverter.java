package task6.replaceExceptionWithTest;

public class TemperatureConverter {
    public static Double convertToCelsius(double fahrenheit) {
        if (fahrenheit > -459.67) {
            return (fahrenheit - 32) * 5 / 9;
        }
        return null;
    }
}
