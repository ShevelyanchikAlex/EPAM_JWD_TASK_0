package by.epam.task10;

public class Task10 {
    public static void main(String[] args) {
        int[] initArray = {1, 2, 3, 4};
        int[][] matrix = initMatrix(initArray.length, initArray);

        printMatrix(matrix);
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


    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
