package by.epam.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isSumsEquals(2112));
    }

    private static boolean isSumsEquals(int number) {
        int sum1 = number / 1000 + (number / 100) % 10;
        int sum2 = number % 10 + (number / 10) % 10;

        return sum1 == sum2;
    }

    private static boolean isSumsEqualsCyclicalOption(int number) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                sum1 += number % 10;
            } else {
                sum2 += number % 10;
            }
            number /= 10;
        }

        return sum1 == sum2;
    }


}
