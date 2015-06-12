//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.artspb.pitest.examples.twr.example6;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;

public class EclipseDecompiled { // handmade

    public static void main(String[] args) throws Throwable {
        Throwable primaryExceptionVariable = null;
        Throwable caughtThrowableVariable = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                Throwable innerPrimaryExceptionVariable = null;
                Throwable innerCaughtThrowableVariable = null;
                try {
                    BufferedOutputStream bos = new BufferedOutputStream(baos);
                    try {
                        bos.flush();
                    } catch (Throwable t) {
                        innerPrimaryExceptionVariable = t;
                        throw innerPrimaryExceptionVariable;
                    } finally {
                        if (bos != null) {
                            bos.close();
                        }
                    }
                } catch (Throwable t) {
                    innerCaughtThrowableVariable = t;
                    if (innerPrimaryExceptionVariable == null) {
                        innerPrimaryExceptionVariable = innerCaughtThrowableVariable;
                    } else if (innerPrimaryExceptionVariable != innerCaughtThrowableVariable) {
                        innerPrimaryExceptionVariable.addSuppressed(innerCaughtThrowableVariable);
                    }
                    throw innerPrimaryExceptionVariable;
                }
            } catch (Throwable t) {
                primaryExceptionVariable = t;
                throw primaryExceptionVariable;
            } finally {
                if (baos != null) {
                    baos.close();
                }
            }
        } catch (Throwable t) {
            caughtThrowableVariable = t;
            if (primaryExceptionVariable == null) {
                primaryExceptionVariable = caughtThrowableVariable;
            } else if (primaryExceptionVariable != caughtThrowableVariable) {
                primaryExceptionVariable.addSuppressed(caughtThrowableVariable);
            }
            throw primaryExceptionVariable;
        }
    }
}
