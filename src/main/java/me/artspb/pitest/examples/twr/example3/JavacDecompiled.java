package me.artspb.pitest.examples.twr.example3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled { // Java Decompiler

    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Throwable localThrowable2 = null;
            try {
                baos.flush();
            } catch (Throwable localThrowable1) {
                localThrowable2 = localThrowable1;
                throw localThrowable1;
            } finally {
                if (baos != null) {
                    if (localThrowable2 != null) {
                        try {
                            baos.close();
                        } catch (Throwable x2) {
                            localThrowable2.addSuppressed(x2);
                        }
                    } else {
                        baos.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }
    }
}
