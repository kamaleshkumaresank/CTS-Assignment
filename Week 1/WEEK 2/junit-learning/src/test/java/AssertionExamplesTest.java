//package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class AssertionExamplesTest {
    
    @Test
    public void testBasicAssertions() {
        // Assert equals
        assertEquals("Testing integer equality", 5, 2 + 3);
        assertEquals("Testing string equality", "Hello", "Hello");
        assertEquals("Testing double equality", 3.14, 3.14, 0.001);
        
        // Assert true/false
        assertTrue("5 should be greater than 3", 5 > 3);
        assertFalse("5 should not be less than 3", 5 < 3);
        
        // Assert null/not null
        String nullString = null;
        String nonNullString = "Test";
        assertNull("String should be null", nullString);
        assertNotNull("String should not be null", nonNullString);
    }
    
    @Test
    public void testArrayAssertions() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = {1, 2, 3, 4, 5};
        assertArrayEquals("Arrays should be equal", expected, actual);
    }
    
    @Test
    public void testStringAssertions() {
        String message = "JUnit Testing";
        
        // Assert that string contains substring
        assertTrue("String should contain 'JUnit'", message.contains("JUnit"));
        assertTrue("String should start with 'JUnit'", message.startsWith("JUnit"));
        assertTrue("String should end with 'Testing'", message.endsWith("Testing"));
    }
    
    @Test
    public void testCollectionAssertions() {
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript");
        
        assertEquals("List should have 3 elements", 3, languages.size());
        assertTrue("List should contain Java", languages.contains("Java"));
        assertFalse("List should not contain C++", languages.contains("C++"));
    }
}