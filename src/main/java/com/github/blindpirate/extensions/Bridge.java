package com.github.blindpirate.extensions;

public class Bridge {
    public CaptureSystemOutputExtension newCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
