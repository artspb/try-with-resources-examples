//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.artspb.pitest.examples.twr.example6;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavacDecompiled {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Throwable primaryExc = null;
        try {
            BufferedOutputStream bos = new BufferedOutputStream(baos);
            Throwable internalPrimaryExc = null;
            try {
                bos.flush();
            } catch (Throwable t) {
                internalPrimaryExc = t;
                throw t;
            } finally {
                if (bos != null) {
                    if (internalPrimaryExc != null) {
                        try {
                            bos.close();
                        } catch (Throwable suppressedExc) {
                            internalPrimaryExc.addSuppressed(suppressedExc);
                        }
                    } else {
                        bos.close();
                    }
                }
            }
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
    }
}
