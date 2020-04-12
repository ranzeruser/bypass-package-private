package com.github.blindpirate.extensions;

public class Bridge {
    public static Object getCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
