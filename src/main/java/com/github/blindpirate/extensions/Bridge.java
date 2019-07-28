package com.github.blindpirate.extensions;

public class Bridge {
    public static Object  createCaptureSystemOutputExtension() {

        return new CaptureSystemOutputExtension();
    }
}
