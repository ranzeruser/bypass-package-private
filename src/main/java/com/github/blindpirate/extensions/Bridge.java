package com.github.blindpirate.extensions;

public class Bridge {
    public static Object CreatCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}