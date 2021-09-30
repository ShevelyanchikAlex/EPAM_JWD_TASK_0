package by.epam.services.writer.interfaces;

public interface Writer {
    void write(Object obj);

    void writeLn(Object obj);

    void writeF(String format, Object... args);
}
