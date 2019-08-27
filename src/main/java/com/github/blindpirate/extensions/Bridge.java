package com.github.blindpirate.extensions;

public class Bridge {
    public static Object bridge(){
        return new CaptureSystemOutputExtension();
    }
}
