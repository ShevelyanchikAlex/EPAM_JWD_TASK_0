package by.epam.task5;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task5 {

    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();
        double[] arr = inputNumbers(3, reader);

        for (double v : arr) {
            if (v >= 0) {
                writer.writeLn(Math.pow(v, 2));
            } else {
                writer.writeLn(Math.pow(v, 4));
            }
        }
    }

    private static double[] inputNumbers(int number, Reader reader) {
        double[] arr = new double[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readDouble();
        }
        return arr;
    }

}
