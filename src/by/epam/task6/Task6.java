package by.epam.task6;

public class Task6 {
    public static void main(String[] args) {
        double max, min;
        double sum;
        double[] arr = {-2, 3, -10};
        min = max = arr[0];

        for (double num : arr) {
            if (num < min) {
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }
            }
        }

        sum = min + max;
        System.out.println(sum);
    }
}
