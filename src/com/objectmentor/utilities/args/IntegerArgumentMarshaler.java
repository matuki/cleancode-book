package com.objectmentor.utilities.args;

import com.objectmentor.utilities.args.exception.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.objectmentor.utilities.args.exception.ArgsException.ErrorCode.*;
public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private int intValue = 0;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            intValue = Integer.parseInt(parameter);
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_INTEGER);
        } catch (NumberFormatException e) {
            throw new ArgsException(INVALID_INTEGER, parameter);
        }
    }

    @Override
    public Object get() {
        return intValue;
    }
}