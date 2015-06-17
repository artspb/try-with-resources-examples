package me.artspb.pitest.examples.twr.example1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled { // Java Decompiler

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // L11
        Throwable primaryExc = null; // L12
        try {
            baos.flush(); // L3
        } catch (Throwable t) { // L5
            primaryExc = t;
            throw t;
        } finally { // L6
            if (baos != null) { // L4 L10
                if (primaryExc != null) {
                    try {
                        baos.close(); // L0 L7
                    } catch (Throwable suppressedExc) { // L2 L9
                        primaryExc.addSuppressed(suppressedExc); // L15 L19
                    } // L1 L16 L8 L20
                } else {
                    baos.close(); // L14 L18
                }
            } // L17
        } // L13
    }
}
