package com.objectmentor.utilities.args;

import com.objectmentor.utilities.args.exception.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.objectmentor.utilities.args.exception.ArgsException.ErrorCode.*;

public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue;

    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public Object get() {
        return stringValue;
    }
}