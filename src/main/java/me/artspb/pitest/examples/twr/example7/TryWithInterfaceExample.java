package me.artspb.pitest.examples.twr.example7;

import java.io.*;

/**
 * @author Artem Khvastunov
 */
public class TryWithInterfaceExample {

    public static void main(String[] args) throws IOException {
        try (Closeable os = new ByteArrayOutputStream()) {
            ((Flushable) os).flush();
        }
    }
}
