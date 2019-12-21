package com.github.hcsp.encapsulation;

import com.github.blindpirate.extensions.Bridge;
//import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Main {
    public static void main(String[] args) {
        System.out.println(createCaptureSystemOutputExtension().getClass().getName());
    }
    public static Object createCaptureSystemOutputExtension() {
        return Bridge.createCaptureSystemOutputExtension();
    }

}
