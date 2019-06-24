package com.github.blindpirate.extensions;

public class BridgeCaptureSystemOutputExtension {
    public static Object getCaptureSystemOutputExtensionInstance() {
        return new CaptureSystemOutputExtension();
    }
}
