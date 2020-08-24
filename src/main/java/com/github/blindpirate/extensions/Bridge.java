package com.github.blindpirate.extensions;

public class Bridge {
    public static Object getInstance(){
        return new CaptureSystemOutputExtension();
    }
}
