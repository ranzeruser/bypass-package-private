package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newHackInstance() {
        return new CaptureSystemOutputExtension();
    }
}
