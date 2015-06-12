package me.artspb.pitest.examples.twr.example4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled { // Java Decompiler

    public static void main(String[] args) throws IOException {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Throwable primaryExc = null;
            try {
                baos.flush();
            } catch (Throwable t) {
                primaryExc = t;
                throw t;
            } finally {
                if (baos != null) {
                    if (primaryExc != null) {
                        try {
                            baos.close();
                        } catch (Throwable suppressedExc) {
                            primaryExc.addSuppressed(suppressedExc);
                        }
                    } else {
                        baos.close();
                    }
                }
            }
        } finally {
            System.out.println("Finally!");
        }
    }
}
