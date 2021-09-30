package by.epam.services.writer.impl;

import by.epam.services.writer.interfaces.Writer;

public class WriterImpl implements Writer {

    public WriterImpl() {
    }

    @Override
    public void write(Object obj) {
        System.out.print(obj);
    }

    @Override
    public void writeLn(Object obj) {
        System.out.println(obj);
    }

    @Override
    public void writeF(String format, Object... args) {
        System.out.printf(format, args);
    }
}
