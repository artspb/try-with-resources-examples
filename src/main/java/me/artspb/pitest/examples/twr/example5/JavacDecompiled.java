package me.artspb.pitest.examples.twr.example5;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled { // handmade

    public static void main(String[] args) throws Throwable {
        ByteArrayOutputStream baos /* 1 */ = new ByteArrayOutputStream(); // L22
        Throwable localThrowable2 /* 2 */ = null; // L23
        try {
            BufferedOutputStream bos /* 3 */ = new BufferedOutputStream(baos); // L14
            Throwable localThrowable4 /* 4 */ = null; // L24
            try {
                bos.flush(); // L3
            } catch (Throwable localThrowable3) { // L5
                localThrowable4 = localThrowable3;
                throw localThrowable3;
            } finally { // L6
                if (bos != null) { // L4 L10
                    if (localThrowable4 != null) {
                        try {
                            bos.close(); // L0 L7
                        } catch (Throwable x1) { // L2 L9
                            localThrowable4.addSuppressed(x1); // L26 L30
                        }
                    } else {
                        bos.close(); // L25 L29
                    }
                }
            } // L15 L28
        } catch (Throwable localThrowable1) { // L16
            localThrowable2 = localThrowable1;
            throw localThrowable1;
        } finally { // L17
            if (baos != null) { // L15 L21
                if (localThrowable2 != null) {
                    try {
                        baos.close(); // L11 L18
                    } catch (Throwable x2) { // L13 L20
                        localThrowable2.addSuppressed(x2); // L34 L38
                    }
                } else {
                    baos.close(); // L33 L37
                }
            }
        } // L32 L36
    }
}
