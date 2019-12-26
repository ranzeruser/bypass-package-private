package com.github.blindpirate.extensions;

public class Bridge {
    public static CaptureSystemOutputExtension createCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
