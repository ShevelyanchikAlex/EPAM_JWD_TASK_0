package by.epam.task3;

public class Task3 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;

        double perimeter = calculatePerimeter(a, b);
        double square = calculateSquare(a, b);
        System.out.println("Perimeter = " + perimeter + ", Square = " + square);
    }

    private static double calculatePerimeter(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }

    private static double calculateSquare(double a, double b) {
        return 0.5 * a * b;
    }
}
