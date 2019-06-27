package com.github.blindpirate.extensions;

public class ClassBridge {
    public static Object newBridgeObj(){
        return new CaptureSystemOutputExtension();
    }
}
