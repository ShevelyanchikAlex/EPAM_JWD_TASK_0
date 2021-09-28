package by.epam.task5;

public class Task5 {

    public static void main(String[] args) {
        double[] arr = {-2, 3, 4};

        for (double v : arr) {
            if (v >= 0) {
                System.out.println(Math.pow(v, 2));
            } else {
                System.out.println(Math.pow(v, 4));
            }
        }
    }
}
