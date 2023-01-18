package com.objectmentor.utilities.args;

import com.objectmentor.utilities.args.exception.ArgsException;

import java.util.Iterator;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    public static String[] getValue(ArgumentMarshaler argumentMarshaler) {
        return new String[]{""};
    }

    @Override
    // TODO: Empty implementation
    public void set(Iterator<String> currentArgument) throws ArgsException {

    }

    @Override
    // TODO: Empty implementation
    public Object get() {
        return null;
    }
}
