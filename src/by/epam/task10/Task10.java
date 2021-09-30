package by.epam.task10;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task10 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        int[] initArray = inputNumbers(4, reader);
        int[][] matrix = initMatrix(initArray.length, initArray);

        printMatrix(matrix, writer);
    }

    private static int[] inputNumbers(int number, Reader reader) {
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readInt();
        }
        return arr;
    }

    private static int[][] initMatrix(int n, int[] initArray) {
        int[][] matrix = new int[n][n];
        int offset = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = initArray[Math.abs(++offset)];
            }
            offset++;
            offset *= -1;
        }

        return matrix;
    }


    private static void printMatrix(int[][] matrix, Writer writer) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                writer.write(anInt + " ");
            }
            writer.writeLn("");
        }
    }

}
