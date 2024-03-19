package org.example.HomeworkJava7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void testIsValidAccountNumber_Valid() {
        String accountNumber = "12345678901234";
        assertTrue(BankAccount.isValidAccountNumber(accountNumber));
    }

    @Test
    public void testIsValidAccountNumber_Null() {
        String accountNumber = null;
        assertFalse(BankAccount.isValidAccountNumber(accountNumber));
    }

    @Test
    public void testIsValidAccountNumber_Empty() {
        String accountNumber = "";
        assertFalse(BankAccount.isValidAccountNumber(accountNumber));
    }

    @Test
    public void testIsValidAccountNumber_AllZero() {
        String accountNumber = "00000000000000";
        assertFalse(BankAccount.isValidAccountNumber(accountNumber));
    }

    @Test
    public void testIsValidAccountNumber_InvalidLength() {
        String accountNumber = "123456789012345";
        assertFalse(BankAccount.isValidAccountNumber(accountNumber));
    }
    @Test
    public void testIsValidAccountNumber_NotDigits() {
        String accountNumber = "1234567890abcd";
        assertFalse(BankAccount.isValidAccountNumber(accountNumber));
    }
}