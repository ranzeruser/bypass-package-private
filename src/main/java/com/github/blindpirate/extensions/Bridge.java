package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newInstance(){
        // 访问同一包中的私有类
        return new CaptureSystemOutputExtension();
    }
}
