package com.objectmentor.utilities.args;

import java.util.Iterator;
import com.objectmentor.utilities.args.exception.ArgsException;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    private boolean booleanValue = false;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }

    @Override
    public Object get() {
        return booleanValue;
    }
}