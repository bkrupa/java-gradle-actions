package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class HelloWorldTest {
    
    @Test
    void testHelloWorld() {
        // This is a simple test to verify the class exists
        HelloWorld app = new HelloWorld();
        assertNotNull(app);
    }
    
    @Test
    void testGetMessage() {
        // Test the getMessage method returns "Brad Test"
        HelloWorld app = new HelloWorld();
        assertEquals("Brad Test", app.getMessage());
    }
    
    @Test
    void testMainOutput() {
        // Capture stdout to test the main method output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        try {
            HelloWorld.main(new String[]{});
            String output = outputStream.toString();
            assertTrue(output.contains("Brad Test"));
            assertTrue(output.contains("Welcome to your Java Gradle application!"));
        } finally {
            System.setOut(originalOut);
        }
    }
}