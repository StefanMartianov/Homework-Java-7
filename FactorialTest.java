package org.example.HomeworkJava7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorial_Zero() {
        int n = 0;
        int expected = 1;
        int actual = Factorial.factorial(n);
        assertEquals(expected, actual);
    }
    @Test
    void testFactorial_Positive() {
        int n = 5;
        int expected = 120;
        int actual = Factorial.factorial(n);
        assertEquals(expected, actual);
    }
    @Test
    public void testFactorial_Negative() {
        try {
            Factorial.factorial(-5);
        } catch (IllegalArgumentException e) {
            assertEquals("Факториал определен только для неотрицательных чисел", e.getMessage());
        }
    }
}