package by.epam.task8;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task8 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        int[] arr = inputNumbers(6, reader);
        int k = reader.readInt();
        writer.writeLn(calculateSumMultiplesK(arr, k));
    }

    private static int[] inputNumbers(int number, Reader reader) {
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readInt();
        }
        return arr;
    }

    private static int calculateSumMultiplesK(int[] arr, int k) {
        int sum = 0;
        for (int num : arr) {
            if (num % k == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
