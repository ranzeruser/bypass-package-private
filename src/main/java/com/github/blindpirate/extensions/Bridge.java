package com.github.blindpirate.extensions;

public class Bridge {
    public static Object myCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
