package me.artspb.pitest.examples.twr.example1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled { // Java Decompiler

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // L11
        Throwable localThrowable2 = null; // L12
        try {
            baos.flush(); // L3
        } catch (Throwable localThrowable1) { // L5
            localThrowable2 = localThrowable1;
            throw localThrowable1;
        } finally { // L6
            if (baos != null) { // L4 L10
                if (localThrowable2 != null) {
                    try {
                        baos.close(); // L0 L7
                    } catch (Throwable x2) { // L2 L9
                        localThrowable2.addSuppressed(x2); // L15 L19
                    } // L16 L8 L20
                } else {
                    baos.close(); // L14 L18
                }
            } // L17
        } // L13
    }
}
