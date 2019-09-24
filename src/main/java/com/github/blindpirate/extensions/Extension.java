package com.github.blindpirate.extensions;

import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Extension {
    Extension(){

    }
    public static CaptureSystemOutputExtension newInstance(){
        return new CaptureSystemOutputExtension();
    }
}
