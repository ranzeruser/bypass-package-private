package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newClass(){
        return new CaptureSystemOutputExtension();
    }
}
