package com.github.blindpirate.extensions;

public class Bridge {
    public CaptureSystemOutputExtension newInstance(){
        return new CaptureSystemOutputExtension();
    }
}
