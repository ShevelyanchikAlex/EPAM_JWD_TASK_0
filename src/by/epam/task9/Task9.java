package by.epam.task9;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        int[] arr1 = inputNumbers(4, reader);
        int[] arr2 = inputNumbers(4, reader);
        int k = reader.readInt();
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0; j < arr1.length; j++) {
            if ((j - 1) == k) {
                for (int num : arr2) {
                    arr3[i++] = num;
                }
            } else {
                arr3[i++] = arr1[j];
            }
        }

        writer.writeLn(Arrays.toString(arr3));
    }


    private static int[] inputNumbers(int number, Reader reader) {
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readInt();
        }
        return arr;
    }
}
