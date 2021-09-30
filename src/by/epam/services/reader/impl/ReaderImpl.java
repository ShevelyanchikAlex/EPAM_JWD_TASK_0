package by.epam.services.reader.impl;

import by.epam.services.reader.interfaces.Reader;
import by.epam.services.validator.impl.ValidatorImpl;
import by.epam.services.validator.interfaces.Validator;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

import java.util.Scanner;

public class ReaderImpl implements Reader {
    private final Scanner scanner;
    private final Validator validator;
    private final Writer writer;

    public ReaderImpl() {
        this.scanner = new Scanner(System.in);
        this.validator = new ValidatorImpl();
        this.writer = new WriterImpl();
    }

    @Override
    public double readDouble() {
        boolean isValid = false;
        String inputVal = "";

        while (!isValid) {
            writer.write("Input double value: ");
            inputVal = scanner.nextLine();
            isValid = validator.isValidDouble(inputVal);
        }

        return Double.parseDouble(inputVal);
    }

    @Override
    public int readInt() {
        boolean isValid = false;
        String inputVal = "";

        while (!isValid) {
            writer.write("Input int value: ");
            inputVal = scanner.nextLine();
            isValid = validator.isValidInt(inputVal);
        }

        return Integer.parseInt(inputVal);
    }
}
