package by.epam.services.validator.impl;

import by.epam.services.validator.interfaces.Validator;
import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;

public class ValidatorImpl implements Validator {
    private final Writer writer;

    public ValidatorImpl() {
        this.writer = new WriterImpl();
    }


    @Override
    public boolean isValidDouble(String inputValue) {
        boolean isValid = false;

        try {
            Double.parseDouble(inputValue);
            isValid = true;
        } catch (NumberFormatException e) {
            writer.writeLn("Error: Invalid input format!\n Try again to input value.");
        }
        return isValid;
    }

    @Override
    public boolean isValidInt(String inputValue) {
        boolean isValid = false;

        try {
            Integer.parseInt(inputValue);
            isValid = true;
        } catch (NumberFormatException e) {
            writer.writeLn("Error: Invalid input format!\n Try again to input value.");
        }
        return isValid;
    }
}
