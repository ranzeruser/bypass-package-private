package com.github.blindpirate.extensions;

public class bridge {                                       //public ；类
    public static CaptureSystemOutputExtension object() {                               // 工厂方法 对象 生产一个新对象
        return new CaptureSystemOutputExtension();          // CaptureSystemOutputExtension 他是私有的
    }
}
