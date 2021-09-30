package by.epam.task2;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task2 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        double a = reader.readDouble();
        double b = reader.readDouble();
        double c = reader.readDouble();

        try {
            double result = calculateExpression(a, b, c);
            writer.write(result);
        } catch (ArithmeticException e) {
            writer.writeLn(e.getMessage());
        }
    }

    private static double calculateExpression(double a, double b, double c) throws ArithmeticException {
        double result;

        if (isDenominatorValid(a)) {
            result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        } else {
            throw new java.lang.ArithmeticException("Calculation failed, denominator is 0");
        }
        return result;
    }

    private static boolean isDenominatorValid(double denominator) {
        return denominator != 0;
    }

}
