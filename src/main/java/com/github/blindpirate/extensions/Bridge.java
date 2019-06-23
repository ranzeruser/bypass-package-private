package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
