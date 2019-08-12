package com.github.blindpirate.extensions;

import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class CaptureSystemOutputExtensionBridge {
    public static Object createInstance() {
        return new CaptureSystemOutputExtension();
    }
}
