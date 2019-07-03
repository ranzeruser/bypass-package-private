package com.github.blindpirate.extensions;

public class Capture {
  static CaptureSystemOutputExtension captureSystemOutputExtension = new CaptureSystemOutputExtension();

  public static Object getCapture() {
    return captureSystemOutputExtension;
  }
}
