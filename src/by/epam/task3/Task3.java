package by.epam.task3;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task3 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        double a = reader.readDouble();
        double b = reader.readDouble();

        double perimeter = calculatePerimeter(a, b);
        double square = calculateSquare(a, b);

        writer.write("Perimeter = " + perimeter + ", Square = " + square);
    }

    private static double calculatePerimeter(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }

    private static double calculateSquare(double a, double b) {
        return 0.5 * a * b;
    }
}
