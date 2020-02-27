package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newCapture() {
        return new CaptureSystemOutputExtension();
    }

}
