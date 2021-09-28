package by.epam.task9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {-3, -2, -1};
        int k = 2;
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int j = 0; j < arr1.length; j++) {
            if ((j - 1) == k) {
                for (int num : arr2) {
                    arr3[i++] = num;
                }
            } else {
                arr3[i++] = arr1[j];
            }
        }

        System.out.println(Arrays.toString(arr3));
    }
}
