package by.epam.task7;

public class Task7 {
    public static void main(String[] args) {
        double a = 1, b = 6;
        double h = 2;

        printTable(a, b, h);
    }

    private static void printTable(double a, double b, double h) {
        final String line = "-------------------------";
        System.out.println(line);
        System.out.printf("|\t%4s\t|\t%5s\t|\n", 'x', 'y');
        System.out.println(line);
        for (double i = a; i <= b; i += h) {
            System.out.printf("|\t%4.1f\t|\t%4.3f\t|\n", i, Math.pow(Math.sin(i), 2) - Math.cos(2 * i));
        }
        System.out.println(line);
    }
}
