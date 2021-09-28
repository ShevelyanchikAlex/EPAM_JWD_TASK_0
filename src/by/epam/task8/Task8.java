package by.epam.task8;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 3, 23, 85};
        int k = 3;
        int sum = calculateSumMultiplesK(arr, k);

        System.out.println(sum);
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
