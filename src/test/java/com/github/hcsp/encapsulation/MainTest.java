package com.github.hcsp.encapsulation;

import com.github.blindpirate.extensions.BlackTech;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void bypassPackagePrivate() {
        Assertions.assertEquals(
                "com.github.blindpirate.extensions.CaptureSystemOutputExtension",
                BlackTech.createCaptureSystemOutputExtension().getClass().getName());
        Assertions.assertTrue(
                org.junit.jupiter.api.extension.BeforeEachCallback.class.isAssignableFrom(
                        BlackTech.createCaptureSystemOutputExtension().getClass()));
    }
}
