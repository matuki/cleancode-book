package com.objectmentor.utilities.args;

import java.util.Iterator;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    public static String[] getValue(ArgumentMarshaler argumentMarshaler) {
        return new String[]{""};
    }

    @Override
    // TODO: Empty implementation
    public void set(Iterator<String> currentArgument) throws ArgsException {

    }
}
