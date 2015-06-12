package me.artspb.pitest.examples.twr.example5;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled { // handmade

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos /* 1 */ = new ByteArrayOutputStream(); // L22
        Throwable primaryExc /* 2 */ = null; // L23
        try {
            BufferedOutputStream bos /* 3 */ = new BufferedOutputStream(baos); // L14
            Throwable internalPrimaryExc /* 4 */ = null; // L24
            try {
                bos.flush(); // L3
            } catch (Throwable t) { // L5
                internalPrimaryExc = t;
                throw t;
            } finally { // L6
                if (bos != null) { // L4 L10
                    if (internalPrimaryExc != null) {
                        try {
                            bos.close(); // L0 L7
                        } catch (Throwable suppressedExc) { // L2 L9
                            internalPrimaryExc.addSuppressed(suppressedExc); // L26 L30
                        }
                    } else {
                        bos.close(); // L25 L29
                    }
                }
            } // L15 L28
        } catch (Throwable localThrowable1) { // L16
            primaryExc = localThrowable1;
            throw localThrowable1;
        } finally { // L17
            if (baos != null) { // L15 L21
                if (primaryExc != null) {
                    try {
                        baos.close(); // L11 L18
                    } catch (Throwable suppressedExc) { // L13 L20
                        primaryExc.addSuppressed(suppressedExc); // L34 L38
                    }
                } else {
                    baos.close(); // L33 L37
                }
            }
        } // L32 L36
    }
}
