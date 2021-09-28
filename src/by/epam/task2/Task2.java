package by.epam.task2;

public class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 4;
        double c = 5;

        double result = calculateExpression(a, b, c);
        System.out.println(result);
    }

    private static double calculateExpression(double a, double b, double c) {
        double result;

        if (a == 0) {
            throw new java.lang.ArithmeticException("Calculation failed, denominator is 0");
        } else {
            result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        }
        return result;
    }

}
