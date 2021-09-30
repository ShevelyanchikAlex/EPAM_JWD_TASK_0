package by.epam.task6;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task6 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        double[] arr = inputNumbers(3, reader);
        findSumMinAndMax(arr, writer);
    }

    private static double[] inputNumbers(int number, Reader reader) {
        double[] arr = new double[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readDouble();
        }
        return arr;
    }

    private static void findSumMinAndMax(double[] arr, Writer writer) {
        double min = arr[0];
        double max = arr[0];

        for (double num : arr) {
            if (num < min) {
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }
            }
        }
        writer.writeLn(min + max);
    }

}
