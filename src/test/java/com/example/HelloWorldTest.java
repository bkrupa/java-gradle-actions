package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    
    @Test
    void testHelloWorld() {
        // This is a simple test to verify the class exists
        HelloWorld app = new HelloWorld();
        assertNotNull(app);
    }
}