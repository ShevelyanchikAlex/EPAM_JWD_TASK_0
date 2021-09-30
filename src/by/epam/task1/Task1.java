package by.epam.task1;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task1 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        writer.write(isSumsEquals(reader.readInt()));
    }

    private static boolean isSumsEquals(int number) {
        int sum1 = number / 1000 + (number / 100) % 10;
        int sum2 = number % 10 + (number / 10) % 10;

        return sum1 == sum2;
    }


}
