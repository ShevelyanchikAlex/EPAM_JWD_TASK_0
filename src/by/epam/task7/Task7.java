package by.epam.task7;

import by.epam.services.reader.impl.ReaderImpl;
import by.epam.services.reader.interfaces.Reader;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class Task7 {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        printTable(reader.readDouble(), reader.readDouble(), reader.readDouble(), writer);
    }

    private static void printTable(double a, double b, double h, Writer writer) {
        final String line = "-------------------------";
        writer.writeLn(line);
        writer.writeF("|\t%4s\t|\t%5s\t|\n", 'x', 'y');
        writer.writeLn(line);
        for (double i = a; i <= b; i += h) {
            writer.writeF("|\t%4.1f\t|\t%4.3f\t|\n", i, Math.pow(Math.sin(i), 2) - Math.cos(2 * i));
        }
        writer.writeLn(line);
    }
}
