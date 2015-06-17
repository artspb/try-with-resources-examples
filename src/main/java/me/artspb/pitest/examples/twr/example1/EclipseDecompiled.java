package me.artspb.pitest.examples.twr.example1;

import java.io.ByteArrayOutputStream;

public class EclipseDecompiled { // handmade

    public static void main(String[] paramArrayOfString) throws Throwable {
        Throwable primaryExceptionVariable = null; // L5
        Throwable caughtThrowableVariable = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); // L3
            try {
                baos.flush(); // L0
            } catch (Throwable t) {
                primaryExceptionVariable = t; // L2
                throw primaryExceptionVariable; // L7
            } finally {
                if (baos != null) { // L1
                    baos.close();
                }
            }
        } catch (Throwable t) {
            caughtThrowableVariable = t; // L4
            if (primaryExceptionVariable == null) {
                primaryExceptionVariable = caughtThrowableVariable;
            } else if (primaryExceptionVariable != caughtThrowableVariable) { // L8
                primaryExceptionVariable.addSuppressed(caughtThrowableVariable);
            }
            throw primaryExceptionVariable; // L9
        } // L6
    }
}
