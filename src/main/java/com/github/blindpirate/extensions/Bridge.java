package com.github.blindpirate.extensions;

public class Bridge {

    private static CaptureSystemOutputExtension  a =  new CaptureSystemOutputExtension();

    public static Object getBridge(){
        return a;
    }
}
