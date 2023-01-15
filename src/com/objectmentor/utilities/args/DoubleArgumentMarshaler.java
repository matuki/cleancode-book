package com.objectmentor.utilities.args;

import java.util.Iterator;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {
    public static Double getValue(ArgumentMarshaler argumentMarshaler) {
        return 0.0d;
    }

    @Override
    // TODO: Empty implementation
    public void set(Iterator<String> currentArgument) throws ArgsException {

    }
}
