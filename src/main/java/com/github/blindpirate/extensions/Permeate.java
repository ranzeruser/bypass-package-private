package com.github.blindpirate.extensions;
import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Permeate {
    public static Object get(){
        return new CaptureSystemOutputExtension();
    }
}
