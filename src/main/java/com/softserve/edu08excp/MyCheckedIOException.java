package com.softserve.edu08excp;

import java.io.IOException;

class MyCheckedIOException extends IOException {

    // Classic constructor with a message of error
    public MyCheckedIOException(String msg) {
        super(msg);
    }
}  