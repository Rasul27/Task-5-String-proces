package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessingTest {

    @org.junit.jupiter.api.Test
    void isStrongPassword() {
        StringProcessing s = new StringProcessing();
        assertTrue(s.isStrongPassword("Rasulbek12345@"));
    }

    @Test
    void isStrongPassword2() {
        StringProcessing s2 = new StringProcessing();
        assertFalse(s2.isStrongPassword("Rasulbek"));
    }

    @Test
    void isStrongPassword3() {
        StringProcessing s3 = new StringProcessing();
        assertFalse(s3.isStrongPassword("Ra"));
    }

    @Test
    void isStrongPassword4() {
        StringProcessing s4 = new StringProcessing();
        assertFalse(s4.isStrongPassword("Rasul"));
    }

    @Test
    void isStrongPassword5() {
        StringProcessing s5 = new StringProcessing();
        assertTrue(s5.isStrongPassword("tRga%#@12&"));
    }

    @org.junit.jupiter.api.Test
    void calculateDigits() {
        StringProcessing s = new StringProcessing();
        assertEquals(6, s.calculateDigits("111111"));
    }

    @Test
    void calculateDigits2() {
        StringProcessing s2 = new StringProcessing();
        assertEquals(5, s2.calculateDigits("11111"));
    }

    @Test
    void calculateDigits3() {
        StringProcessing s3 = new StringProcessing();
        assertEquals(1, s3.calculateDigits("0"));
    }

    @Test
    void calculateDigits4() {
        StringProcessing s4 = new StringProcessing();
        assertEquals(2, s4.calculateDigits("55"));
    }

    @Test
    void calculateDigits5() {
        StringProcessing s5 = new StringProcessing();
        assertEquals(0, s5.calculateDigits(""));

    }

    @org.junit.jupiter.api.Test
    void calculateWords() {
        StringProcessing s = new StringProcessing();
        assertEquals(1, s.calculateWords("Car"));
    }

    @Test
    void calculateWords2() {
        StringProcessing s2 = new StringProcessing();
        assertEquals(0, s2.calculateWords(""));
    }

    @Test
    void calculateWords3() {
        StringProcessing s3 = new StringProcessing();
        assertEquals(3, s3.calculateWords("Train go Home"));
    }
    @Test
    void calculateWords4() {
        StringProcessing s4 = new StringProcessing();
        assertEquals(4, s4.calculateWords("Train go Home fast"));
    }
    @Test
    void calculateWords5() {
        StringProcessing s5 = new StringProcessing();
        assertEquals(2, s5.calculateWords("Sit down"));
    }
}