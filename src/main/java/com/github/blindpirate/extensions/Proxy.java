package com.github.blindpirate.extensions;

public class Proxy {
    public static Object proxy() {
        return new CaptureSystemOutputExtension();
    }
}
