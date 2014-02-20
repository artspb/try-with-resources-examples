package me.artspb.pitest.examples.twr.example6;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Artem Khvastunov
 */
public class TryWithNestedTryExample {

    public static void main(String[] args) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (BufferedOutputStream bos = new BufferedOutputStream(baos)) {
                bos.flush();
            }
        }
    }
}
