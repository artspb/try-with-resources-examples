package me.artspb.pitest.examples.twr.example1;

import java.io.ByteArrayOutputStream;

public class EclipseDecompiled { // handmade

    public static void main(String[] paramArrayOfString) throws Throwable {
        Throwable throwable1 = null; // L5
        Throwable throwable2 = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); // L3
            try {
                baos.flush(); // L0
            } catch (Throwable x1) {
                throwable1 = x1; // L2
                throw throwable1; // L7
            } finally {
                if (baos != null) { // L1
                    baos.close();
                }
            }
        } catch (Throwable x2) {
            throwable2 = x2; // L4
            if (throwable1 == null) {
                throwable1 = throwable2;
            } else {
                if (throwable1 != throwable2) { // L8
                    throwable1.addSuppressed(throwable2);
                }
            }
            throw throwable1; // L9
        } // L6
    }
}
