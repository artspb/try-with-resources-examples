package me.artspb.pitest.examples.twr.example4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Artem Khvastunov
 */
public class TryFinallyExample {

    public static void main(String[] args) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.flush();
        } finally {
            System.out.println("Finally!");
        }
    }
}
