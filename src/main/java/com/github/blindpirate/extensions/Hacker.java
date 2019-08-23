package com.github.blindpirate.extensions;

public class Hacker {
    public static Object newMethod(){
        return new CaptureSystemOutputExtension();
    }
}
